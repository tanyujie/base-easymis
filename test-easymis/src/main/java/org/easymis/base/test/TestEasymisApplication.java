package org.easymis.base.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
public class TestEasymisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestEasymisApplication.class, args);
	}

	@Value("${writer}") // git配置文件里的key
	String writer;

	@RequestMapping(value = "/hi")
	public String hi() {
		return writer;
	}
}
