package game2peer.manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import game2peer.mybatis.dao.GroupRoleMapper;
import game2peer.mybatis.dao.GroupUrlMapper;
import game2peer.mybatis.domain.GroupUrl;
import game2peer.mybatis.domain.GroupUrlExample;

@Service
public class GroupManager {

	public static final int AnonymousGroup = 1;
	
	@Autowired
	private GroupRoleMapper groupRoleMapper;
	
	@Autowired
	private GroupUrlMapper groupUrlMapper;
	
	
	@Cacheable("groups")
	public Collection<? extends GrantedAuthority> getAuthorities(Integer groupId)
	{
		List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
		/*
		List<GroupRoleKey> l = this.groupRoleMapper.getRoleIds(groupId);
		for (int i = 0; i < l.size(); i++)
			authList.add(new SimpleGrantedAuthority(l.get(i).getRoleId().toString()));*/
		authList.add(new SimpleGrantedAuthority(groupId.toString()));
		return authList;
	}
	
	@Cacheable("groupMap")
	public Map<String, AccessRight> getGroupAccessRight(String groupId)
	{
		GroupUrlExample e = new GroupUrlExample();
		e.createCriteria().andGroupIdEqualTo(Integer.valueOf(groupId));
		e.setOrderByClause("url");
		//List<GroupUrl> l = groupUrlMapper.getAccessRightByGroup(groupId);
		List<GroupUrl> l = groupUrlMapper.selectByExample(e);
		
		Map<String, AccessRight> groupMap = new HashMap<String, AccessRight>();
		for (int i = 0; i < l.size(); i++)
		{
			AccessRight value = new AccessRight();
			value.setGet(l.get(i).getGetRight());
			value.setPut(l.get(i).getPutRight());
			value.setDel(l.get(i).getDelRight());
			value.setModi(l.get(i).getModiRight().intValue());
			value.setOper(l.get(i).getOperRight().intValue());
			
			groupMap.put(l.get(i).getUrl(), value);
		}
		return groupMap;
	}
	
	@Cacheable("groupAccessUrl")
	public Object[] getGroupAccessUrl(String groupId)
	{
		Map<String, AccessRight> m = getGroupAccessRight(groupId); 
		return m.keySet().toArray(); 
	}
	
	public AccessRight getAccessRight(String groupId, String url)
	{
		Object[] urls = getGroupAccessUrl(groupId);	
		PathMatcher matcher = new AntPathMatcher();
		for (int i = 0 ; i < urls.length; i++)
		{
		   if (matcher.match((String)urls[i], url))
		   {	   
			   return getGroupAccessRight(groupId).get(urls[i]);
		   }	 
		}
		return null;
	}
	
	public void updateAnonymousConfig(HttpSecurity http)
	{
		Set<String> s = getGroupAccessRight("1").keySet();
		for (Iterator<String> g = s.iterator(); g.hasNext();)
		{	
		    try {
				http.authorizeRequests().antMatchers(g.next()).permitAll();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}    
	}
}

