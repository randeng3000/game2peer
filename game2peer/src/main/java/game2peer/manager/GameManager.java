package game2peer.manager;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import game2peer.mybatis.dao.BusiGameDownloadMapper;
import game2peer.mybatis.dao.BusiGameManagerMapper;
import game2peer.mybatis.dao.BusiGameMapper;
import game2peer.mybatis.dao.BusiGamePaymentMapper;
import game2peer.mybatis.dao.BusiGameShareMapper;
import game2peer.mybatis.domain.BusiGame;
import game2peer.mybatis.domain.BusiGameDownloadExample;
import game2peer.mybatis.domain.BusiGameExample;
import game2peer.mybatis.domain.BusiGameManagerExample;
import game2peer.mybatis.domain.BusiGameManagerKey;
import game2peer.mybatis.domain.BusiGamePayment;
import game2peer.mybatis.domain.BusiGameShareExample;
import game2peer.mybatis.domain.User;
import game2peer.utility.StringUtility;

@Service
@Transactional
public class GameManager {

	@Autowired
	private BusiGameMapper busiGameMapper;
	@Autowired
	private BusiGamePaymentMapper busiGamePaymentMapper;
	@Autowired
	private BusiGameShareMapper busiGameShareMapper;
	@Autowired
	private BusiGameDownloadMapper busiGameDownloadMapper;
	@Autowired
	private GlobalValueManager globalValueManager;
	@Autowired
	private BusiGameManagerMapper busiGameManagerMapper;
	@Autowired(required=true)
	private CacheManager cacheManager;

	@Cacheable(value="gameAdparter",  condition="#result!=null")
	public GameAdpater getGameAdpater(String gameCode)
	{
		GameAdpater gameAdpater = new GameAdpater();
		BusiGame game = this.getGameById(gameCode);
		if (game != null)
		{	
		    gameAdpater.setGame(game);
		    {
			    BusiGameShareExample example = new BusiGameShareExample();
			    example.createCriteria().andGameIdEqualTo(gameCode);
			    gameAdpater.setShares(this.busiGameShareMapper.selectByExample(example));
		    }
		    {
			    BusiGameDownloadExample example = new BusiGameDownloadExample();
			    example.createCriteria().andGameIdEqualTo(gameCode);
			    gameAdpater.setDownloads(this.busiGameDownloadMapper.selectByExample(example));
		    }
		    return gameAdpater;
		}   
		return null;
	}
	
	public String getGameShareLink(BusiGame game, String userId)
	{
		if (game == null)
		   return null;	
		StringBuffer buffer = new StringBuffer();
		
		String domain = game.getRegisterWithDomain();
        if (StringUtility.hasEmpty(domain))
        	domain = globalValueManager.getValue("global.prefix");
        
		buffer.append(domain);
		buffer.append("/games/");
		buffer.append(game.getId());
		buffer.append("/");
		buffer.append(userId);
		return buffer.toString();
	}
	
	public List<GameAdpater> getManagedGames(String userId)
	{
		BusiGameManagerExample e1 = new BusiGameManagerExample();
		e1.createCriteria().andUserIdEqualTo(userId);
		List<BusiGameManagerKey> l =busiGameManagerMapper.selectByExample(e1);
		List<BusiGame> gl = null;
		
		if (l.size() == 0)
		{
		    //只管理自己的
			BusiGameExample c = new BusiGameExample();
			c.createCriteria().andUserIdEqualTo(userId);
			c.setOrderByClause("create_date");
			gl = this.busiGameMapper.selectByExample(c);
		}
		else
		{
			BusiGameExample c = new BusiGameExample();
			c.setOrderByClause("create_date");
			ArrayList<String> userlist = new ArrayList<String>(); 
			ArrayList<String> gamelist = new ArrayList<String>(); 
			for (int i = 0; i < l.size(); i++)
			{
			    if (l.get(i).getUserIdManaged().equals("*"))
			    {
			    	//管理所有用户的
			    	gl = this.busiGameMapper.selectByExample(c);
			    }
			    else
			    {
			    	if (l.get(i).getGameId().equals("*"))
			    	{
			    		//所有该用户名下的游戏
			    	    userlist.add(l.get(i).getUserIdManaged());
			    	}
			    	else
			    	{
			    		//特定游戏
			    		gamelist.add(l.get(i).getGameId());
			    	}
			    }
			}
			
			//特定用户，特定游戏
			if (userlist.size() > 0)
			{
				c.createCriteria().andUserIdIn(userlist);
				if (gamelist.size() > 0)
				{
					c.or(c.createCriteria().andIdIn(gamelist));
				}
			}
			else
			{
				c.createCriteria().andIdIn(gamelist);
			}
			gl = this.busiGameMapper.selectByExample(c);
		}
		if (gl != null)
		{
			ArrayList<GameAdpater> adlist = new ArrayList<GameAdpater>();
			for (int i = 0; i < gl.size(); i++)
			{
				adlist.add(getGameAdpater(gl.get(i).getId()));
			}
			return adlist;
		}
		return null;
	}
	
	public List<BusiGame> getRecommended()
	{
		BusiGameExample c = new BusiGameExample();
		c.createCriteria().andRecommendedGreaterThanOrEqualTo(0);
		return busiGameMapper.selectByExample(c);
	}

	@Cacheable(value="gameList")
	public List<BusiGame> getGameListByOrderClasue(String orderBy, int page)
	{
		int len = 12;
		BusiGameExample c = new BusiGameExample();
		c.setLimitStart(page*len);
		c.setLimitEnd(len);
		c.setOrderByClause(orderBy);
		
		return busiGameMapper.selectByExample(c);
	}
	
	public BusiGame getGameById(String gameCode)
	{
		BusiGame g = busiGameMapper.selectByPrimaryKey(gameCode);
		if (StringUtility.hasEmpty(g.getDownloadPage()))
		{
			g.setDownloadPage("/games/download?gameid=" + g.getId());
		}
		if (StringUtility.hasEmpty(g.getRegisterWithDomain()))
		{
			g.setRegisterWithDomain(globalValueManager.getValue("global.prefix"));
		}
		
		return g;
	}
	
	public BusiGame getPerfered()
	{
		return getRecommended().get(0);
	}
	
	public int insertGamePayment(String orderId, String gameCode, String loginName, String createTime, BigDecimal amount, String currency)
	{
		BusiGamePayment record = new BusiGamePayment();
		record.setOrderId(orderId);
		record.setGameCode(gameCode);
		record.setLoginName(loginName);
		DateFormat fmt = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		//fmt.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date d = null;
		try {
			d = fmt.parse(createTime);
			//d = getDateWithTimeZone(d, TimeZone.getTimeZone("GMT"));
			
			/*
			Calendar gmtCal = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
			gmtCal.setTime(d);
			d = gmtCal.getTime();*/
			record.setCreatetimeInGame(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		record.setAmount(amount);
		record.setCurrency(currency);
		record.setCoin(new BigDecimal(0));
		record.setInviteCode("-");
		record.setReceiveTime(new Date());
		record.setErrorCode(1);
		
		if (busiGamePaymentMapper.insert(record) == 1)
		  return 0;
		else
		  return -1;	
	}
	
	public boolean insertGameInfo(BusiGame game)
	{
		return this.busiGameMapper.insertSelective(game) == 1;
	}
	
	public Date getDateWithTimeZone(Date t, TimeZone zone)
	{
		Calendar c = Calendar.getInstance();
		c.setTime(t);
		Calendar gmtCal = new GregorianCalendar(zone);
		gmtCal.set(Calendar.YEAR, c.get(Calendar.YEAR));
		gmtCal.set(Calendar.MONTH, c.get(Calendar.MONTH));
		gmtCal.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH));
		
		gmtCal.set(Calendar.HOUR, c.get(Calendar.HOUR));
		gmtCal.set(Calendar.MINUTE, c.get(Calendar.MINUTE));
		gmtCal.set(Calendar.SECOND, c.get(Calendar.SECOND));
		
		return gmtCal.getTime();
		
	}
	
}
