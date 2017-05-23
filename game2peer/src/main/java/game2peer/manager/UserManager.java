package game2peer.manager;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import game2peer.jdbctemplate.dao.SummaryDao;
import game2peer.jdbctemplate.domain.SummaryBean;
import game2peer.mvc.bean.UserRegister;
import game2peer.mybatis.dao.BusiGameUserMapper;
import game2peer.mybatis.dao.BusiUserAccountDetailsMapper;
import game2peer.mybatis.dao.BusiUserAccountMapper;
import game2peer.mybatis.dao.BusiUserGalleryMapper;
import game2peer.mybatis.dao.UserMailMapper;
import game2peer.mybatis.dao.UserMapper;
import game2peer.mybatis.domain.BusiGameUserExample;
import game2peer.mybatis.domain.BusiUserAccount;
import game2peer.mybatis.domain.BusiUserAccountDetails;
import game2peer.mybatis.domain.BusiUserAccountDetailsExample;
import game2peer.mybatis.domain.BusiUserAccountExample;
import game2peer.mybatis.domain.BusiUserGallery;
import game2peer.mybatis.domain.BusiUserGalleryExample;
import game2peer.mybatis.domain.User;
import game2peer.mybatis.domain.UserExample;
import game2peer.mybatis.domain.UserMail;
import game2peer.mybatis.domain.UserMailExample;
import game2peer.utility.MD5;
import game2peer.utility.StringUtility;

@Service
public class UserManager {
	@Autowired(required=true)
	private UserMapper userMapper;
	
	@Autowired(required=true)
	private GlobalValueManager globalValueManager;
	
	@Autowired(required=true)
	private CacheManager cacheManager;
	
	@Autowired
	private BusiUserGalleryMapper busiUserGalleryMapper;

	@Autowired
	private	BusiUserAccountMapper busiUserAccountMapper;
	
	@Autowired
	private	BusiUserAccountDetailsMapper busiUserAccountDetailsMapper;

	@Autowired
	private UserMailMapper userMailMapper;
	
	@Autowired
	private BusiGameUserMapper busiGameUserMapper;
	
	@Autowired
	private SummaryDao summaryDao;
	
	public List<UserMail> getUserMail(String userId, int page)
	{
		UserMailExample example = new UserMailExample();
		example.createCriteria().andUserIdEqualTo(userId);
		example.setOrderByClause("create_time desc");
		example.setLimitStart((page - 1)*10);
		example.setLimitEnd(10);
		return this.userMailMapper.selectByExample(example);
	}
	
	public List<BusiUserAccountDetails> getAccountDetails(User user, String gameId)
	{
		BusiUserAccountDetailsExample ex = new BusiUserAccountDetailsExample();
		ex.createCriteria().andUserIdEqualTo(user.getId());
		return this.busiUserAccountDetailsMapper.selectByExample(ex);
	}
	
	public List<BusiUserAccount> getAccount(User user)
	{
		BusiUserAccountExample ex = new BusiUserAccountExample();
		ex.createCriteria().andUserIdEqualTo(user.getId());
		return this.busiUserAccountMapper.selectByExample(ex);
	}
	
	public User getUser(String loginName)
	{
		return this.getUserLowerCase(loginName.toLowerCase());
	}

	@Cacheable(value="users", key="#loginName")
	private User getUserLowerCase(String loginName)
	{
		UserExample c = new UserExample();
		c.createCriteria().andLoginNameEqualTo(loginName);
		List<User> l = userMapper.selectByExample(c);
		if (l.size() == 1)
			return l.get(0);
		return null;
	}
	
	@Cacheable("usersWithId")
	public User getUserById(String userId)
	{
		return userMapper.selectByPrimaryKey(userId);
	}
	
	public User getPerfered()
	{
		return userMapper.selectByPrimaryKey("bbd3d22d0c734414b834df91b74e18f8");
	}
	
	public String registerUser(UserRegister ug)
	{
		User record = new User();
		record.setId(StringUtility.generateUuid());
		record.setLoginName(ug.getUsername().toLowerCase());
		record.setPassword(MD5.getMD5String(ug.getPassword()));
		record.setNiceName(ug.getNicename());
		record.setCreateTime(new Date());
		record.setActived("0");
		record.setDenied("0");
		record.setGroupId(2);    //2-平台用户
		
		if (userMapper.insert(record) != 1)
		{	
		  if (this.getUser(record.getLoginName()) != null)
		     return "该邮件地址已经注册";
		  else
			 return "未知错误，请联系客服"; 
		}  
		ug.setUid(record.getId());
		return null;
	}
	
	//@CacheEvict(value="users", key="#user.loginName")
	//@CacheEvict(value="users", key="#user.loginName")
	public void update(User user)
	{
		UserExample c = new UserExample();
		c.createCriteria().andIdEqualTo(user.getId());
		userMapper.updateByExample(user, c);
		try
		{
		   User u = (User) cacheManager.getCache("users").get(user.getLoginName().toLowerCase()).get();
		   if (u != null)
		     cacheManager.getCache("users").put(user.getLoginName().toLowerCase(), user);
		}
		catch (Exception e)
		{
			
		}
		try
		{
		  User u = (User) cacheManager.getCache("usersWithId").get(user.getId()).get();
		  if (u != null)
		     cacheManager.getCache("usersWithId").put(user.getId(), user);
		}
		catch (Exception e)
		{
			
		}
	}
	
	public String getActiveCode(String userId)
	{
		String key = globalValueManager.getValue(GlobalValueManager.global_key);
		return MD5.getMD5String(userId + key);
	}
	
	public void saveImage(BusiUserGallery o)
	{
		this.busiUserGalleryMapper.insert(o);
	}
	
	public List<BusiUserGallery> getImages(String userId, int kind, int page)
	{
		BusiUserGalleryExample example = new BusiUserGalleryExample();
		if (kind == 1)
		  example.setOrderByClause("file_info desc");
		else
		  example.setOrderByClause("create_time desc");
		example.setLimitStart(page*20);
		example.setLimitEnd(20);
		example.createCriteria().andUserIdEqualTo(userId);
		return this.busiUserGalleryMapper.selectByExample(example);
	}
	
	public List<SummaryBean> getMyGameUserSummary(String userId, int page)
	{
		int size = 20;
		List<SummaryBean> l = this.summaryDao.getMyGameUserSummary(userId, (page - 1)*size, size); 
		//busiGameUserMapper
		return l;
	}
	
}
