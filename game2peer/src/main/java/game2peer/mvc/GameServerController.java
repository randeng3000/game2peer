package game2peer.mvc;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import game2peer.manager.GameManager;
import game2peer.mybatis.domain.BusiGame;
import game2peer.utility.MD5;
import game2peer.utility.StringUtility;


@RestController
public class GameServerController {
	@Autowired
	private GameManager gameManager;
	
	//createTime是GMT时间，格式为：yyyy.MM.dd HH:mm:ss
	@PostMapping(value="/paymentCallback")
	public ResponseBean responseForPayCallback(HttpServletRequest request, HttpServletResponse response, String orderId, String gameCode, String loginName, String createTime, String amount, String currency, String signature)
	{
		ResponseBean res = new ResponseBean();
		if (!StringUtility.hasEmpty(orderId, gameCode, loginName, createTime, amount, currency, signature))
		{
			BusiGame game = gameManager.getGameById(gameCode);
			if (game != null)
			{	
				BigDecimal v;
				try
				{
				    v= BigDecimal.valueOf(Double.valueOf(amount));
				    StringBuffer buffer = new StringBuffer();
					buffer.append(orderId);
					buffer.append(gameCode);
					buffer.append(loginName);
					buffer.append(createTime);
					buffer.append(amount);
					buffer.append(currency);
					buffer.append(game.getGameKey());
				    if (MD5.getMD5String(buffer.toString()).equals(signature))
				    {
				    	if (gameManager.insertGamePayment(orderId, gameCode, loginName, createTime, v, currency) < 0)
				      	  res.setCode(ResponseBean.FAILED_CODE);
				    	else
				    	  res.setCode(ResponseBean.SUCCESS_CODE);	
				    }
				    else
				      res.setCode(ResponseBean.INVALID_FIELD_VALUE_CODE);	
				}
				catch (Exception e)
				{
					e.printStackTrace();
					res.setCode(ResponseBean.INVALID_FIELD_VALUE_CODE);
				}
				
			}
			else
			  res.setCode(ResponseBean.INVALID_FIELD_VALUE_CODE);	
		}
		else
		{
			res.setCode(ResponseBean.MISS_FIELD_VALUE_CODE);
		}
		return res;
	}
}
