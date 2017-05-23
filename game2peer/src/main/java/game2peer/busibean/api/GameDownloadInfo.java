package game2peer.busibean.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import game2peer.manager.AccessRight;
import game2peer.manager.GameManager;
import game2peer.mvc.bean.ApiBean;
import game2peer.mybatis.domain.BusiGameDownload;
import game2peer.mybatis.domain.User;
import game2peer.utility.StringUtility;

@Service
public class GameDownloadInfo implements ApiBean {
	@Autowired
	private GameManager gameManager;
	
	@Override
	public Object requestProcess(HttpServletRequest request, HttpServletResponse response, String id, User user,
			AccessRight ar) throws Exception {
		// TODO Auto-generated method stub
		if (user != null)
		{
			String appType = request.getParameter("appType");
			String gameCode = request.getParameter("gameCode");
			if (!StringUtility.hasEmpty(appType, gameCode))
			{
				List<BusiGameDownload> l = gameManager.getGameAdpater(gameCode).getDownloads();
				for (int i = 0; i < l.size(); i++)
				{	
				    if (l.get(i).getAppType().equals(Integer.valueOf(appType)))
				    {
	                    return l.get(i); 			    	
				    }
				}   
			}
		}
		return null;
	}

}
