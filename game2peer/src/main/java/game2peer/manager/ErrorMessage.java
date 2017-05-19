package game2peer.manager;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ErrorMessage {

	final public static int ERROR_PAGE_NOT_FOUND = 10001;
	final public static String LOGIN_FIRST = "请先登录平台！";
	final public static String CHOOSE_ONE_GAME = "请选择一个游戏！";
	
	private Map<Integer, String> messgage = new HashMap<Integer, String>(); 
	
	public ErrorMessage()
	{
		messgage.put(ERROR_PAGE_NOT_FOUND, "页面找不到");
	}
	
	public String getMessage(Integer id)
	{
		return this.messgage.get(id);
	}
}
