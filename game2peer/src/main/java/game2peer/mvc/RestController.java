package game2peer.mvc;

import java.util.Enumeration;

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

import game2peer.manager.APIManager;
import game2peer.manager.AccessRight;
import game2peer.manager.GroupManager;
import game2peer.manager.UserManager;
import game2peer.mvc.bean.ApiBean;
import game2peer.mybatis.domain.RestApis;
import game2peer.mybatis.domain.User;
import game2peer.utility.StringUtility;


@Controller
public class RestController extends ApplicationObjectSupport{

	private static final Logger log = LoggerFactory.getLogger(RestController.class);
	
	@Autowired
	private APIManager apiManager;
	@Autowired
	private UserManager userManager;
	@Autowired
	private GroupManager groupManager;

	@RequestMapping("/api/{id:.+}")
	public void requestAPI(HttpServletRequest request, HttpServletResponse response, @PathVariable String id, Model model) throws Exception
	{
		Enumeration<?> en = request.getParameterNames();
		while (en.hasMoreElements()) {
			String paramName = (String) en.nextElement();
			String paramValue = request.getParameter(paramName);
			log.info(paramName + ":  " + paramValue);
		}
		 
		if (!StringUtility.hasEmpty(id))
		{	
		   RestApis api = this.apiManager.getAPI(id);
		   if ((api != null) && (!StringUtility.hasEmpty(api.getBean())))
		   {
			   User user = null;
			   AccessRight ar = null;
			   
			   Object p = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			   if (p instanceof UserDetails)
			   {
				   UserDetails userDetails = (UserDetails) p;
				   String un = userDetails.getUsername();
				   user = this.userManager.getUser(un);
				   ar = this.groupManager.getAccessRight(user.getGroupId().toString(), request.getRequestURI());
				   ApplicationContext ac = this.getApplicationContext();
				   Object o = ac.getBean(api.getBean());
				   if (o instanceof ApiBean)
				   {
					   try
					   {
					       ((ApiBean) o).requestProcess(request, response, id, user, ar);
					   }
					   catch (Exception e)
					   {
						   throw e;
					   }
				   }
			   }
		   }
		}
	}
}
