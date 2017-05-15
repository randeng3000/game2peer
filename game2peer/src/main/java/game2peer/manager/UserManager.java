package game2peer.manager;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import game2peer.mvc.bean.UserRegister;
import game2peer.mybatis.dao.BusiUserGalleryMapper;
import game2peer.mybatis.dao.UserMapper;
import game2peer.mybatis.domain.BusiUserGallery;
import game2peer.mybatis.domain.User;
import game2peer.mybatis.domain.UserExample;
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
	
	public void saveImageFileInfo(BusiUserGallery o)
	{
		this.busiUserGalleryMapper.insert(o);
	}
}
