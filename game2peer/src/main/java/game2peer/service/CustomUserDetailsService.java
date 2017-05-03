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
			//login name is not correct!
  			throw new UsernameNotFoundException("login name is not correct!");
		}	
		else
		{   
			if (u.getActived().equals("0"))
			{
				throw new UsernameNotFoundException("account not actived");
			}
			else if (u.getDenied().equals("1"))
			{
				throw new UsernameNotFoundException("account has been denied");
			}
			
			User user = new User(loginName, u.getPassword(), true, true, true, true, this.groupManager.getAuthorities(u.getGroupId()));
			
			return user;
		}
	}
}
