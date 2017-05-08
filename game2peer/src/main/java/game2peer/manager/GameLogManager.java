package game2peer.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import game2peer.mybatis.dao.BusiGameLogMapper;
import game2peer.mybatis.domain.BusiGameLog;
import game2peer.mybatis.domain.BusiGameLogExample;

@Service
public class GameLogManager {
	@Autowired
	private BusiGameLogMapper busiGameLogMapper;

	@CachePut(value="gameLog", key="#record.gameCode")
	public void log(BusiGameLog record)
	{
		busiGameLogMapper.insert(record);
	}
	
	@Cacheable(value="gameLog")
	public BusiGameLog getMessage(String gameCode)
	{
		BusiGameLogExample e = new BusiGameLogExample();
		e.createCriteria().andGameCodeEqualTo(gameCode);
		e.setOrderByClause("create_time desc limit 0,1");
		List<BusiGameLog> l = busiGameLogMapper.selectByExample(e);
		if (l.size() > 0) 
		  return l.get(0);
		else
		  return null;	
	}
}
