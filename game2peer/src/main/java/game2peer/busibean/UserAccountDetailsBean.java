package game2peer.busibean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import game2peer.manager.AccessRight;
import game2peer.manager.ErrorMessage;
import game2peer.manager.GameManager;
import game2peer.manager.UserManager;
import game2peer.mvc.bean.PageBean;
import game2peer.mybatis.domain.User;
import game2peer.utility.StringUtility;

@Service
public class UserAccountDetailsBean implements PageBean {
	@Autowired
	private UserManager userManager;
	
	@Override
	public void requestProcess(HttpServletRequest request, HttpServletResponse response, String id, Model model,
			User user, AccessRight ar) throws Exception {
		// TODO Auto-generated method stub
		String gameId = request.getParameter("gameId");
		if (StringUtility.hasEmpty(gameId))
		{
		 	model.addAttribute("errorMessage", "请输入要查询的游戏ID");
		}  
		else
		{	model.addAttribute("gameId", gameId);
            model.addAttribute("accountDetails", userManager.getAccountDetails(user, gameId));
		}    
	}

}
