package game2peer.manager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import game2peer.mybatis.dao.UserMapper;
import game2peer.mybatis.domain.User;

@Service
public class UserManager {
	@Autowired(required=true)
	private UserMapper userMapper;
	
	@Cacheable("users")
	public User getUser(String loginName)
	{
		return userMapper.selectByLoginName(loginName);
	}
	
	public User getUserById(String userId)
	{
		return userMapper.selectByPrimaryKey(userId);
	}
	
	public User getPerfered()
	{
		return userMapper.selectByPrimaryKey("bbd3d22d0c734414b834df91b74e18f8");
	}
}
