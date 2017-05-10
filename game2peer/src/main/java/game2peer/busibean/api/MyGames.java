package game2peer.busibean.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import game2peer.manager.AccessRight;
import game2peer.manager.GameManager;
import game2peer.mvc.bean.ApiBean;
import game2peer.mybatis.domain.User;

@Service
public class MyGames implements ApiBean {
	@Autowired
	private GameManager gameManager;
	
	@Override
	public Object requestProcess(HttpServletRequest request, HttpServletResponse response, String id, User user,
			AccessRight ar) throws Exception {
		// TODO Auto-generated method stub
		JQGridAdpater j = new JQGridAdpater();
		j.setRows(gameManager.getRecommended());
		return j;
	}

}
