package game2peer.manager;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import game2peer.mvc.bean.GameUserRegister;
import game2peer.mybatis.dao.BusiGameUserMapper;
import game2peer.mybatis.domain.BusiGameUser;

@Service
public class GameUserManager {
	@Autowired(required=true)
	private BusiGameUserMapper busiGameUserMapper;

	public boolean insert(GameUserRegister user)
	{
		BusiGameUser record = new BusiGameUser();
		record.setGameCode(user.getGameCode());
		record.setLoginName(user.getUsername());
		record.setCreateTime(new Date());
		record.setPlathformUserId(user.getPlathformUserId());
		record.setPassword(user.getPassword());
		record.setGameUserId(user.getGameUserId());
		try
		{
		    int i = this.busiGameUserMapper.insert(record);
		    return i == 1;
		}
		catch (Exception e)
		{
			return false;	
		}
	}
}
