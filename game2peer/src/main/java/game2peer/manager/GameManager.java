package game2peer.manager;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import game2peer.mybatis.dao.BusiGameMapper;
import game2peer.mybatis.dao.BusiGamePaymentMapper;
import game2peer.mybatis.dao.BusiGameProfitsMapper;
import game2peer.mybatis.domain.BusiGame;
import game2peer.mybatis.domain.BusiGameExample;
import game2peer.mybatis.domain.BusiGamePayment;
import game2peer.utility.StringUtility;

@Service
@Transactional
public class GameManager {

	@Autowired
	private BusiGameMapper busiGameMapper;
	@Autowired
	private BusiGamePaymentMapper busiGamePaymentMapper;
	@Autowired
	private BusiGameProfitsMapper busiGameProfitsMapper;

	@Autowired
	private GlobalValueManager globalValueManager;
	
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
