package game2peer.config;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class SpringConfig {

	@Bean
	public MessageSource messageSource()
	{
		ReloadableResourceBundleMessageSource r = new ReloadableResourceBundleMessageSource();
		r.setBasename("locale/lang");
		r.setCacheSeconds(-1);
		String s = r.getMessage("welcome", null, Locale.CHINA);
		return r;
	};
}
