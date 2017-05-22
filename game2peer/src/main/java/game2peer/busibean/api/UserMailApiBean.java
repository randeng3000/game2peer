package game2peer.busibean.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import game2peer.manager.AccessRight;
import game2peer.manager.UserManager;
import game2peer.mvc.bean.ApiBean;
import game2peer.mybatis.domain.User;
import game2peer.utility.StringUtility;

@Service
public class UserMailApiBean implements ApiBean {
	@Autowired
	private UserManager userManager;
	
	@Override
	public Object requestProcess(HttpServletRequest request, HttpServletResponse response, String id, User user,
			AccessRight ar) throws Exception {
		// TODO Auto-generated method stub
		if (user != null)
		{
			String kind = request.getParameter("kind");
			kind="0";
			String page = request.getParameter("page");
			if (!StringUtility.hasEmpty(page))
			{
				return userManager.getUserMail(user.getId(), Integer.valueOf(page));
			}
		}
		else
		{
			
		}
		return null;
	}

}
