package org.easymis.base.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableConfigServer
//激活注册发现
@EnableDiscoveryClient
public class ConfigEasymisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigEasymisApplication.class, args);
	}
}
