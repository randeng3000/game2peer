package game2peer.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

import game2peer.manager.AccessRight;
import game2peer.mybatis.domain.User;

public interface PageBean {
	public void requestProcess(HttpServletRequest request,	HttpServletResponse response, String id, Model model, User user, AccessRight ar) throws Exception;
}
