package hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

	@RequestMapping("/pages/g/{id:.+}")
	public String requestPages(HttpServletRequest request,	HttpServletResponse response, @PathVariable String id, Model model) throws Exception
	{
		//环境属性
		//匿名用户
		User user = null;
		
		user = new User();
		user.setLoginName("test");
		user.setGroupId(2);
		model.addAttribute("__userInfo", user);
		
		AccessRight ac = new AccessRight();
		ac.setDel(1);
		ac.setGet(1);
		ac.setModi(1);
		ac.setPut(1);
		model.addAttribute("__accessRight", ac);
		
		model.addAttribute("__content_page", "page1");

		//页面特殊属性
		model.addAttribute("pageObject", "test");
		
		return "layout/t1";
	}
	
	@RequestMapping("/pages/t/{id:.+}")
	public String requestPages1(HttpServletRequest request,	HttpServletResponse response, @PathVariable String id, Model model) throws Exception
	{
		//环境属性
		//匿名用户
		User user = null;
		
		user = new User();
		user.setLoginName("test");
		user.setGroupId(2);
		model.addAttribute("__userInfo", user);
		
		AccessRight ac = new AccessRight();
		ac.setDel(1);
		ac.setGet(1);
		ac.setModi(1);
		ac.setPut(1);
		model.addAttribute("__accessRight", ac);
		
		model.addAttribute("__content_page", "page1");

		//页面特殊属性
		model.addAttribute("pageObject", "test");
		
		return "register";
	}

	@RequestMapping("/apis/g/{id:.+}")
	public void requestApi(HttpServletRequest request,	HttpServletResponse response, @PathVariable String id) throws Exception
	{
		
	}

}
