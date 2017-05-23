package game2peer.busibean.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import game2peer.manager.AccessRight;
import game2peer.manager.GameManager;
import game2peer.mvc.bean.ApiBean;
import game2peer.mybatis.domain.BusiGameShare;
import game2peer.mybatis.domain.User;
import game2peer.utility.StringUtility;

@Service
public class GameShareInfo implements ApiBean {
	@Autowired
	private GameManager gameManager;
	
	@Override
	public Object requestProcess(HttpServletRequest request, HttpServletResponse response, String id, User user,
			AccessRight ar) throws Exception {
		// TODO Auto-generated method stub
		if (user != null)
		{
			String shareId = request.getParameter("shareId");
			String gameCode = request.getParameter("gameCode");
			if (!StringUtility.hasEmpty(shareId, gameCode))
			{
				
				List<BusiGameShare> l = gameManager.getGameAdpater(gameCode).getShares();
				for (int i = 0; i < l.size(); i++)
				{	
				    if (l.get(i).getId().equals(Integer.valueOf(shareId)))
				    {
	                    return l.get(i); 			    	
				    }
				}   
			}
		}
		return null;
	}

}
