package game2peer.busibean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

import game2peer.manager.AccessRight;
import game2peer.mvc.bean.PageBean;
import game2peer.mybatis.domain.User;

public class LoginBean implements PageBean {

	@Override
	public void requestProcess(HttpServletRequest request, HttpServletResponse response, String id, Model model,
			User user, AccessRight ar) throws Exception {
		// TODO Auto-generated method stub
		//request. 
	}

}