package game2peer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.WebAttributes;

import game2peer.utility.MD5;


public class CustomAuthenticationProvider implements AuthenticationProvider {

	private CustomUserDetailsService customUserDetailsService;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		 //username
		//String s = WebAttributes.AUTHENTICATION_EXCEPTION;
        System.out.println("user name: "+authentication.getName());
        //password
        System.out.println("password: "+authentication.getCredentials());
        System.out.println("getPrincipal: "+authentication.getPrincipal());
        System.out.println("getAuthorities: "+authentication.getAuthorities());
        System.out.println("getDetails: "+authentication.getDetails());
        String password = MD5.getMD5String(authentication.getCredentials().toString());
        
        try
        {
           UserDetails userDetails = (UserDetails)this.customUserDetailsService.loadUserByUsername(authentication.getName());
           if (!userDetails.getPassword().equals(password))
           {
        	   //密码错误
        	   throw new UsernameNotFoundException("E001");
           }	   
           UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(
                   userDetails, authentication.getCredentials(),userDetails.getAuthorities());
           return result;
        }
        catch (UsernameNotFoundException e)
        {
        	throw e;
        }
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return true;
	}

	public void setUserDetailsService(CustomUserDetailsService customUserDetailsService) {
		this.customUserDetailsService = customUserDetailsService;
	}

}
