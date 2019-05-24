package org.easymis.base.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TurbineEasymisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineEasymisApplication.class, args);
	}
}
