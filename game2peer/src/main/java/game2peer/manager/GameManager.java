package game2peer.manager;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import game2peer.mybatis.dao.BusiGameMapper;
import game2peer.mybatis.domain.BusiGame;
import game2peer.mybatis.domain.BusiGameExample;

@Service
public class GameManager {

	@Autowired
	private BusiGameMapper busiGameMapper;
	
	public List<BusiGame> getRecommended()
	{
		BusiGameExample c = new BusiGameExample();
		
		c.createCriteria().andRecommendedGreaterThanOrEqualTo(0);
		
		return busiGameMapper.selectByExample(c);
		
	}
	
	public BusiGame getGameByGameCode(String gameCode)
	{
        BusiGameExample c = new BusiGameExample();
		
		c.createCriteria().andGameCodeEqualTo(gameCode);
		
		List<BusiGame> l = busiGameMapper.selectByExample(c);
		if ((l != null) && (l.size() >= 1))
		  return l.get(0);
		else
		  return null;	
	}
	
	public BusiGame getPerfered()
	{
		return getRecommended().get(0);
	}
}
