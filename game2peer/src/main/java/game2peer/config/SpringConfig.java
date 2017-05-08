package game2peer.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
public class SpringConfig {

	@Bean
	public MessageSource messageSource()
	{
		ReloadableResourceBundleMessageSource r = new ReloadableResourceBundleMessageSource();
		r.setBasename("classpath:locale/lang");
		r.setCacheSeconds(0);
		//String s = r.getMessage("welcome", null, Locale.CHINA);
		return r;
	};
	@Bean
	@Autowired
	public DataSourceTransactionManager transactionManager(DataSource dataSource)
	{
		return new DataSourceTransactionManager(dataSource);
	}
}
