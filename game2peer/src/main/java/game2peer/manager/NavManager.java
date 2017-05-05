package game2peer.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import game2peer.mybatis.dao.NavMapper;
import game2peer.mybatis.dao.NavigationGroupMapper;
import game2peer.mybatis.domain.Nav;
import game2peer.mybatis.domain.NavigationGroup;

@Service
public class NavManager {
	@Autowired
	private NavMapper navMapper;
	@Autowired
	private NavigationGroupMapper navigationGroupMapper;
	
	private List<NavObject> getChild(int parentId)
	{
		List<Nav> l = navMapper.selectByParentId(parentId);
		List<NavObject> result = new ArrayList<NavObject>(); 
		
		for (int i = 0; i < l.size(); i++)
        {
        	NavObject n = new NavObject();
        	n.setName(l.get(i).getTitle());
        	n.setUrl(l.get(i).getUrl());
        	n.setSubNav(getChild(l.get(i).getId()));
        	result.add(n);
        }
		return result;
	}
	
	public List<NavObject> getNavObject(int groupId)
	{
		NavigationGroup n = navigationGroupMapper.selectByPrimaryKey(groupId);
		if (n != null)
		  return getChild(n.getNavigationId());
		return null;
	}
	
	public List<NavObjectForView> getNavObjectForView(int groupId)
	{
		NavigationGroup n = navigationGroupMapper.selectByPrimaryKey(groupId);
		if (n != null)
		  return getSubList(getChild(n.getNavigationId()));
		return null;
	}
	
	private List<NavObjectForView> getSubList(List<NavObject> l)
	{
		List<NavObjectForView> v = new ArrayList<NavObjectForView>();
		for (int i = 0; i < l.size(); i++)
		{
			NavObjectForView ele = new NavObjectForView();
			ele.setName(l.get(i).getName());
			ele.setUrl(l.get(i).getUrl());
			if (l.get(i).getSubNav().size() > 0)
			{
				ele.setLeaf(false);
				v.add(ele);
				List<NavObjectForView> s = getSubList(l.get(i).getSubNav());
				for (int j = 0; j < s.size(); j++)
				  v.add(s.get(j));
				v.add(null);
			}
			else
			{	
				ele.setLeaf(true);
				v.add(ele);
			}	
		}
		return v;
	}
	
}
