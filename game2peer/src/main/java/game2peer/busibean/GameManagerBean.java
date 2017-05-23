package game2peer.busibean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import game2peer.manager.AccessRight;
import game2peer.manager.ErrorMessage;
import game2peer.manager.GameManager;
import game2peer.mvc.bean.PageBean;
import game2peer.mybatis.domain.User;
import game2peer.utility.StringUtility;

@Service
public class GameManagerBean implements PageBean {

	@Autowired
	private GameManager gameManager;
	
	@Override
	public void requestProcess(HttpServletRequest request, HttpServletResponse response, String id, Model model,
			User user, AccessRight ar) throws Exception {
		// TODO Auto-generated method stub
		if (user == null)
		{
		   model.addAttribute("errorMessage", ErrorMessage.LOGIN_FIRST);	
		}
		else
		{
		   String oper = request.getParameter("oper");
		   if (!StringUtility.isEmpty(oper))
           {
	           if (oper.equals("shareInsert"))
	           {
	        	   
	           }
	           else if (oper.equals("shareEdit"))
	           {
	        	   
	           }
	           else if (oper.equals("shareDel"))
	           {
	        	   
	           }
	           else if (oper.equals("downloadInsert"))
	           {
	        	   
	           }
	           else if (oper.equals("downloadEdit"))
	           {
	        	   
	           }
	           else if (oper.equals("downloadDel"))
	           {
	        	   
	           }
           }
           model.addAttribute("games", gameManager.getManagedGames(user.getId()));
		}  
	}
}
