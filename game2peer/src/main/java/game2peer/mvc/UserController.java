package game2peer.mvc;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import game2peer.manager.GameManager;
import game2peer.manager.GlobalValueManager;
import game2peer.manager.MailManager;
import game2peer.manager.UserManager;
import game2peer.mybatis.domain.User;
import game2peer.utility.StringUtility;

@Controller
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private GameManager gameManager;
	
	@Autowired
	private UserManager userManager;
	
	@Autowired
	private MessageSource messageSource;
	
	@Autowired
	private GlobalValueManager globalValueManager;
	
	@Autowired
	private MailManager mailManager;
	
	@RequestMapping("/register")
	public String userRegister(HttpServletRequest request, HttpServletResponse response, UserRegister user, Model model)
	{
		if (user.isValid())
		{
			String msg = userManager.registerUser(user);
			
			if (msg != null)
			   model.addAttribute("msg", msg);
			else
			{
				
			   this.sendActiveCode(user, request.getLocale());	
			   return "forward:/";
			}  
		}
		return "/register";
	}
	
	private void sendActiveCode(UserRegister user, Locale locale)
	{
		String link = globalValueManager.getValue("global.prefix") + "/useractivate" + "?uid=" + user.getUid() + "&key=" + userManager.getActiveCode(user.getUid());
		log.info(link);
		
		mailManager.sendMailTo(user.getUsername(), messageSource.getMessage("注册邮件标题", null, locale), messageSource.getMessage("注册邮件内容", new Object[] {user.getNicename(), link}, locale));
	}
	
	@RequestMapping(value="/useractivate", method=RequestMethod.GET)
	public String userActive(HttpServletRequest request, HttpServletResponse response, String uid, String key)
	{
		if (StringUtility.hasEmpty(uid, key))
		{
			return "forward:/";
		}
		else
		{
			User u = this.userManager.getUserById(uid);
			if (u != null)
			{
				if (this.userManager.getActiveCode(uid).equals(key))
				{
					if (u.getActived().equals("0"))
					{	
					   u.setActived("1");
					   this.userManager.update(u);
					}   
					return "forward:/login?activied";
				}
				else
				{
					return "forward:/register";
				}
			}
			else
				return "forward:/register";
		}
	 }
}
