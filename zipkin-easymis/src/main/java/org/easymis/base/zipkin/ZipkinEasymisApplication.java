package org.easymis.base.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ZipkinEasymisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinEasymisApplication.class, args);
	}
}
