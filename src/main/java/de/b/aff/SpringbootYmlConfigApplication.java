package de.b.aff;

import de.b.aff.config.AppConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
Some sources are saying that we need to add spring-boot-configuration-processor to gradle dependencies
 but it's already contained in compile('org.springframework.boot:spring-boot-starter')
 */
@SpringBootApplication
@EnableConfigurationProperties(AppConfigurationProperties.class)
public class SpringbootYmlConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootYmlConfigApplication.class, args);
	}
}
