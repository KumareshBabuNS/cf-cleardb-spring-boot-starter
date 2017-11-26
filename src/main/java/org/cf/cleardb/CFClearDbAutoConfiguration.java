package org.cf.cleardb;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConditionalOnClass(value= {DataSource.class})
@Profile(value= {"cloud"})
public class CFClearDbAutoConfiguration extends AbstractCloudConfig{

	@Bean
	public DataSource dataSource() {
		return connectionFactory().dataSource();
	}
	
}