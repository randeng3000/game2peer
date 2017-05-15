package game2peer.busibean.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import game2peer.manager.AccessRight;
import game2peer.manager.GameManager;
import game2peer.mvc.bean.ApiBean;
import game2peer.mybatis.domain.User;
import game2peer.utility.StringUtility;

@Service
public class MyGamesList implements ApiBean {
	@Autowired
	private GameManager gameManager;
	
	@Override
	public Object requestProcess(HttpServletRequest request, HttpServletResponse response, String id, User user,
			AccessRight ar) throws Exception {
		String page = request.getParameter("page");
		int g = 0;
		if (!StringUtility.hasEmpty(page))
		{	try
		    { 
			   g = Integer.valueOf(page);
		    }
		    catch (Exception e)
		    {
		    }
		}
		return gameManager.getGameListByOrderClasue("create_date desc", g);
	}

}
