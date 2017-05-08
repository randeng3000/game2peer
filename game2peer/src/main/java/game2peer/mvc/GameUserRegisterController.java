package game2peer.mvc;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.PostMethod;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import game2peer.manager.GameLogManager;
import game2peer.manager.GameManager;
import game2peer.manager.GameUserManager;
import game2peer.manager.UserManager;
import game2peer.mvc.bean.GameUserRegister;
import game2peer.mvc.bean.RegisterResponseBean;
import game2peer.mybatis.domain.BusiGame;
import game2peer.mybatis.domain.BusiGameLog;
import game2peer.mybatis.domain.User;
import game2peer.utility.MD5;
import game2peer.utility.StringUtility;

@Controller
public class GameUserRegisterController {

	@Autowired
	private GameManager gameManager;
	
	@Autowired
	private UserManager userManager;
	
	@Autowired
	private GameUserManager gameUserManager;
	
	@Autowired
	private GameLogManager gameLogManager;
	
	
	@RequestMapping("/games/{gamecode}/{userid}")
	public String loginPages(HttpServletRequest request, HttpServletResponse response, GameUserRegister g_user, @PathVariable String gamecode, @PathVariable String userid, Model model) throws Exception
	{
		//model.addAttribute("__", attributeValue);
		BusiGame g = null;
		User u = null;
		
		
		if (!StringUtility.hasEmpty(gamecode))
		{
			g = gameManager.getGameById(gamecode);
			
			if (g != null)
			{
				switch (g.getRegisterUi())
				{
				   case 1:
					   break;
				   default:
					   model.addAttribute("__content_page", "/g_register_1"); 	   
				}
				
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

        if (!StringUtility.hasEmpty(g_user.getUsername()) && !StringUtility.hasEmpty(g_user.getPassword()) && !StringUtility.hasEmpty(g_user.getRe_password()))
       	{
        	if (g_user.getPassword().equals(g_user.getRe_password()))
        	{
        		g_user.setGameUserId(StringUtility.generateUuid());
        		g_user.setGameCode(gamecode);
        		g_user.setPlathformUserId(userid);
        		if (gameUserManager.insert(g_user))
        		{
        			RegisterResponseBean bean = send(g, g_user);
        			if (bean != null)
        			{
        				if (bean.getCode().equals(RegisterResponseBean.SUCCESS_CODE))
        				{
                            //跳转至下载页面        					
        					return "redirect://" + g.getDownloadPage() + "?gameId=" + g.getId();
        				}
        			}
        		}
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
	
	public RegisterResponseBean send(BusiGame game, GameUserRegister user)
	{
	   BusiGameLog log = new BusiGameLog();
	   log.setGameCode(user.getGameCode());
	   log.setCreateTime(new Date());
	   
       StringBuffer url = new StringBuffer();
       url.append(game.getRegisterCallback());
	   MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
	   HttpClient httpClient = new HttpClient(connectionManager);
	   
	   httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(60000);
	   PostMethod postMethod = null;
	   try {
		 postMethod = new PostMethod(url.toString());
		 String gameCode = user.getGameCode();
		 String gameUserId = user.getGameUserId();
		 String gameUsername = user.getUsername();
		 String password = null;
		 if (game.getRegisterPasswordType() == 0)
			 password = MD5.getMD5String(user.getPassword());
		 else
			 password = user.getPassword();
		 String plathformUserId = user.getPlathformUserId();
		 String signature = this.getSignature(gameCode, gameUserId, gameUsername, password, plathformUserId, game.getGameKey());
		 
		 postMethod.addParameter("gameCode", gameCode);
		 postMethod.addParameter("gameUserId", gameUserId);
		 postMethod.addParameter("gameUsername", gameUsername);
		 postMethod.addParameter("password", password);
		 postMethod.addParameter("plathformUserId", plathformUserId);
		 postMethod.addParameter("signature", signature);
		 
		 httpClient.executeMethod(postMethod);

		 String response = postMethod.getResponseBodyAsString();
		 if (response != null)
		 {	 
			 RegisterResponseBean bean = new RegisterResponseBean();
		     JSONObject json = new JSONObject(response);
		     bean.setCode(json.getString("code"));
		     bean.setGameUserId(json.getString("gameUserId"));
		     bean.setSuggestLoginName(json.getString("suggestLoginName"));
		     log.setMessage(response);
		     return bean;
		 } 
	   }
	   catch (Exception e)
	   {
           log.setMessage(e.getMessage());		   
	   }
	   
	   gameLogManager.log(log);
	   
	   return null;
    }
	
	public String getSignature(String... args)
	{
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < args.length; i++)
		{	
		   s.append(args[i]);
		}   
		return MD5.getMD5String(s.toString());
	}
}
