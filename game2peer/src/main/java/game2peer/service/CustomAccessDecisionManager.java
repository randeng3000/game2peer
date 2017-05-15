package game2peer.service;

import java.util.Collection;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.FilterInvocation;
import org.springframework.stereotype.Service;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import game2peer.manager.GroupManager;

@Service
public class CustomAccessDecisionManager implements AccessDecisionManager {

	@Autowired(required=true)
	private GroupManager groupManager;
	
	@Override
	public void decide(Authentication user, Object url, Collection<ConfigAttribute> arg2)
			throws AccessDeniedException, InsufficientAuthenticationException {
		// TODO Auto-generated method stub
		/*
        System.out.println(user);
        System.out.println(((FilterInvocation) url).getRequestUrl());
        System.out.println(arg2);
        */
		if (user.isAuthenticated())
		{
			PathMatcher matcher = new AntPathMatcher();
			for (Iterator<? extends GrantedAuthority> g = user.getAuthorities().iterator(); g.hasNext();)
			{
				String id = g.next().getAuthority();
				if (id != null)
				{	
				   Object[] urls = groupManager.getGroupAccessUrl(id);	
				   String v = ((FilterInvocation) url).getRequestUrl();
				   for (int i = 0 ; i < urls.length; i++)
				   {
					   if (matcher.match((String)urls[i], v))
						  return; 
				   }
				}   
			}
			throw new AccessDeniedException("access denied");
		}
		else
			throw new InsufficientAuthenticationException("not authenticated");
	}

	@Override
	public boolean supports(ConfigAttribute attribute) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return true;
	}

}
