package game2peer.mvc.bean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

import game2peer.manager.AccessRight;
import game2peer.mybatis.domain.User;

public interface ApiBean {
	public String requestProcess(HttpServletRequest request,	HttpServletResponse response, String id, User user, AccessRight ar) throws Exception;
}
