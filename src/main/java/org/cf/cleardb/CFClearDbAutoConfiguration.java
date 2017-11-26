package org.cf.cleardb;

import javax.activation.DataSource;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(value= {DataSource.class})
public class CFClearDbAutoConfiguration extends AbstractCloudConfig{

	
}