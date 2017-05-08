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
		return (this.busiGameUserMapper.insert(record) == 1);
	}
}
