package com.privalia.perfiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:dev.properties")
@Profile("dev")
public class DevEnvConfig {
	@Value("${id}")
	private int id;
	
	@Value("${name}")
	private String name;
	
	@Bean
	public User user(){
		return new User (id, name);
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev(){
		return new PropertySourcesPlaceholderConfigurer();
	}
}
