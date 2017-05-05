package game2peer.mvc;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import game2peer.manager.AccessRight;
import game2peer.manager.ErrorMessage;
import game2peer.manager.GroupManager;
import game2peer.manager.NavManager;
import game2peer.manager.NavObject;
import game2peer.manager.PagesManager;
import game2peer.manager.UserManager;
import game2peer.mybatis.domain.Pages;
import game2peer.mybatis.domain.User;
import game2peer.utility.StringUtility;


@Controller
public class PagesController extends ApplicationObjectSupport{

	private static final Logger log = LoggerFactory.getLogger(PagesController.class);
	
	@Autowired
	private PagesManager pageManager;
	
	@Autowired
	private UserManager userManager;
	
	@Autowired
	private GroupManager groupManager;
	
	@Autowired
	private NavManager navManager;
	
	@RequestMapping("/pages/g/{id:.+}")
	public String requestPages(HttpServletRequest request,	HttpServletResponse response, @PathVariable String id, Model model) throws Exception
	{
		
		Enumeration<?> en = request.getParameterNames();
		while (en.hasMoreElements()) {
			String paramName = (String) en.nextElement();
			String paramValue = request.getParameter(paramName);
			log.info(paramName + ":  " + paramValue);
		}
		 
		if (!StringUtility.hasEmpty(id))
		{	
		   Pages page = this.pageManager.getPage(id);
		   if ((page != null) && (!StringUtility.hasEmpty(page.getLayoutTemplate())))
		   {
			   User user = null;
			   AccessRight ar = null;
			   List<NavObject> navList = null;
			   Object p = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			   if (p instanceof UserDetails)
			   {
				   UserDetails userDetails = (UserDetails) p;
				   String un = userDetails.getUsername();
				   user = this.userManager.getUser(un);
				   
				   navList = navManager.getNavObject(user.getGroupId());
				   
				   model.addAttribute("__userInfo", user);
				   ar = this.groupManager.getAccessRight(user.getGroupId().toString(), request.getRequestURI());
				   model.addAttribute("__accessRight", ar);
			   }
			   else
				   navList = navManager.getNavObject(GroupManager.AnonymousGroup);
			   model.addAttribute("__nav", navList);
			   
			   model.addAttribute("__content_page", page.getContentPage());

			   if (!StringUtility.hasEmpty(page.getBean()))
			   {
				   ApplicationContext ac = this.getApplicationContext();
				   Object o = ac.getBean(page.getBean());
				   if (o instanceof PageBean)
				   {
					   try
					   {
					       ((PageBean) o).requestProcess(request, response, id, model, user, ar);
					   }
					   catch (Exception e)
					   {
						   throw e;
					   }
				   }
			   }
			   return page.getLayoutTemplate();
		   }
		}   
		
		return "/error?code=" + ErrorMessage.ERROR_PAGE_NOT_FOUND;
	}
	
	@RequestMapping("/test/{id}")
	public String testPages(HttpServletRequest request,	HttpServletResponse response, @PathVariable String id, Model model)
	{
		return id;
	}
	
}
