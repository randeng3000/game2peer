package game2peer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import game2peer.manager.GroupManager;
import game2peer.service.CustomAccessDecisionManager;
import game2peer.service.CustomAccessDeniedHandler;
import game2peer.service.CustomAuthenticationProvider;
import game2peer.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	@Autowired
	private GroupManager groupManager; 
	@Autowired
	private CustomAccessDecisionManager customAccessDecisionManager;

	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	/*
        http
            .authorizeRequests()
                .antMatchers("/**").permitAll()
                .anyRequest().authenticated()
                .and();*/
    	/*
    	http.anonymous().authorities("2");
    	
    	List<GroupUrl> l = this.groupUrlMapper.getAll();
    	for (int i = 0; i < l.size(); i++)
    	{
    		//管理员可以访问所有页
    		//http.authorizeRequests().antMatchers(l.get(i).getUrl()).hasRole("1");
    		http.authorizeRequests().antMatchers(l.get(i).getUrl()).hasRole(l.get(i).getGroupId().toString());	
    	}
    	*/

    	http.authorizeRequests().
    	    antMatchers("/assets**", "/style**").
    	    permitAll().
    	    anyRequest().
    	    authenticated().
    	    accessDecisionManager(customAccessDecisionManager);
    	//http.authorizeRequests().antMatchers("/style**").permitAll();
    	
    	//匿名用户属于group 1
    	http.anonymous().authorities(String.valueOf(GroupManager.AnonymousGroup));
    	
    	groupManager.updateAnonymousConfig(http);
		http.
		    formLogin().
		      loginPage("/login").
		      permitAll().
		      and().
		    rememberMe().
		      rememberMeParameter("rememberMe").
		      tokenValiditySeconds(60 * 60 * 24 * 10).
		      and().
		    logout().permitAll();
		http.exceptionHandling().accessDeniedHandler(new CustomAccessDeniedHandler());
		//http.cors().disable();
		//http.addFilter(filter);
		/*
		http.
	    formLogin().loginProcessingUrl(null);*/
    }
/*
    @Bean
	CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowedOrigins(Arrays.asList(CorsConfiguration.ALL));
		configuration.setAllowedMethods(Arrays.asList("GET","POST"));

		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/paymentCallback**", configuration);
		return source;
	}*/
    
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    	//auth.userDetailsService(customUserDetailsService).passwordEncoder(new Md5PasswordEncoder());
    	auth.parentAuthenticationManager(null);
    	CustomAuthenticationProvider p = new CustomAuthenticationProvider();
    	p.setUserDetailsService(customUserDetailsService);
    	auth.authenticationProvider(p);
/*    	
        auth
            .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER");*/
    }
}
