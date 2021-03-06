package hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
	
	@RequestMapping("/pages/game/{id:.+}")
	public String requestPages2(HttpServletRequest request,	HttpServletResponse response, @PathVariable String id, Model model) throws Exception
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
		
		return "gamelist";
	}
	
	@RequestMapping("/pages/detail/{id:.+}")
	public String requestPages3(HttpServletRequest request,	HttpServletResponse response, @PathVariable String id, Model model) throws Exception
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
		
		model.addAttribute("__content_page", "detail");

		//页面特殊属性
		model.addAttribute("pageObject", "test");
		
		return "layout/t1";
	}
	
	@RestController
	@RequestMapping("/demo")
	public class DemoController {
	   
	    /**
	     * 返回demo数据:
	     * 请求地址：http://127.0.0.1:8080/demo/getDemo
	     * @return
	     */
	    @RequestMapping("/getDemo")
	    public User getDemo(){
			User user = null;
			user = new User();
			user.setId("12345");
			user.setLoginName("test");
			user.setNiceName("adminadminadminadminadminadminadmin");
			user.setGroupId(2);
	       /*Demo demo = new Demo();
	       demo.setId(1);
	       demo.setName("hi");*/
	       return user;
	    }
	   
	}
	
	

	@RequestMapping("/apis/g/{id:.+}")
	public void requestApi(HttpServletRequest request,	HttpServletResponse response, @PathVariable String id) throws Exception
	{
		
	}

}
