package game2peer.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import game2peer.manager.GameManager;
import game2peer.manager.UserManager;
import game2peer.mybatis.domain.BusiGame;
import game2peer.mybatis.domain.User;
import game2peer.utility.StringUtility;

@Controller
public class GameLoginController {

	@Autowired
	private GameManager gameManager;
	
	@Autowired
	private UserManager userManager;
	
	@RequestMapping("/games/{gamecode}/{userid}")
	public String loginPages(HttpServletRequest request, HttpServletResponse response, GameUserRegister g_user, @PathVariable String gamecode, @PathVariable String userid, Model model) throws Exception
	{
		//model.addAttribute("__", attributeValue);
		BusiGame g = null;
		User u = null;
		
		
		if (!StringUtility.hasEmpty(gamecode))
		{
			g = gameManager.getGameByGameCode(gamecode);
			
			if (g != null)
			{
				model.addAttribute("__content_page", "/g_register_1");
				if (!StringUtility.hasEmpty(userid))
				{	
				   u = userManager.getUserById(userid);
				}   
			}
		}
        if (g == null)
		  g = gameManager.getPerfered();
        if (u == null)
          u = userManager.getPerfered();
		//必须的项目
        boolean baseCheck = false;
        if (!StringUtility.hasEmpty(g_user.getUsername()) && !StringUtility.hasEmpty(g_user.getPassword()) && !StringUtility.hasEmpty(g_user.getRe_password()))
       	{
        	if (g_user.getPassword().equals(g_user.getRe_password()))
        	{
        		baseCheck = true;
        		//回调游戏服，完成注册
        		
        	}
       	}
        else
        {
        	g_user.setUsername("");
        	g_user.setPassword("");
        	g_user.setRe_password("");
        }
        //这里可以坚持备选项目
        
        
        model.addAttribute("action", request.getRequestURL());
		model.addAttribute("game", g);
		model.addAttribute("user", u);
		model.addAttribute("gameuser", g_user);
		
		return "/layout/g_user_register";
	}
}
