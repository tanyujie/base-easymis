package org.easymis.base.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaEasymisApplication {

	public static void main(String[] args) {

		SpringApplication.run(EurekaEasymisApplication.class, args);
	}

}