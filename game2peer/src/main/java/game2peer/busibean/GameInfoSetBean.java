package game2peer.busibean;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import game2peer.manager.AccessRight;
import game2peer.manager.GameAdpater;
import game2peer.manager.GameManager;
import game2peer.mvc.bean.PageBean;
import game2peer.mybatis.domain.BusiGame;
import game2peer.mybatis.domain.User;
import game2peer.utility.StringUtility;

@Service
public class GameInfoSetBean implements PageBean {

	@Autowired
	private GameManager gameManager;
	
	@Override
	public void requestProcess(HttpServletRequest request, HttpServletResponse response, String id, Model model,
			User user, AccessRight ar) throws Exception {
		// TODO Auto-generated method stub
		if (user == null)
		{
			model.addAttribute("errorMessage", "请先登录");
			return;
		}
		//应该坚查权限
		
		BusiGame bean = new BusiGame();
		BeanUtils.populate(bean, request.getParameterMap());
		//id不空，就是编辑
		if (!StringUtility.hasEmpty(bean.getId()))
		{
			GameAdpater g = gameManager.getGameAdpater(bean.getId());
			if (StringUtility.hasEmpty(request.getParameterValues("submit")))
			{		
				if (g != null)
				   model.addAttribute("game", g.getGame());
				else
				   model.addAttribute("errorMessage", "指定的游戏不存在");	
			}
			else
			{
                 				
			}
		}
		else if (!StringUtility.hasEmpty(request.getParameterValues("submit")))
		{
            //这时是新建
			bean.setId(StringUtility.generateUuid());
			bean.setCreateDate(new Date());
			bean.setGameKey(StringUtility.generateUuid());
			bean.setUserId(user.getId());	
			bean.setMode(0);
			if (!gameManager.insertGameInfo(bean))
			   model.addAttribute("errorMessage", "新建游戏失败");	
		}
		else
		{
			model.addAttribute("game", bean);
		}
	}
}
