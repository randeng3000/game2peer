package game2peer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import game2peer.manager.GroupManager;
import game2peer.manager.UserManager;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserManager userManager;
	
	@Autowired
	private GroupManager groupManager;
	
	@Override
	public UserDetails loadUserByUsername(String loginName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		game2peer.mybatis.domain.User u = userManager.getUser(loginName);
		if (u == null)
		{	
			//用户不存在
  			throw new UsernameNotFoundException("E000");
		}	
		else
		{   
			if (u.getActived().equals("0"))
			{
				//没有激活，提示用户
				throw new UsernameNotFoundException("E002");
			}
			else if (u.getDenied().equals("1"))
			{
				//账户被禁用
				throw new UsernameNotFoundException("E003");
			}
			
			User user = new User(loginName, u.getPassword(), true, true, true, true, this.groupManager.getAuthorities(u.getGroupId()));
			
			return user;
		}
	}
}
