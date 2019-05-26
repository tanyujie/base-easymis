package org.easymis.base.txlcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;

@SpringBootApplication
@EnableTransactionManagerServer
public class TxlcnEasymisApplication {
//https://github.com/codingapi/txlcn-demo
	public static void main(String[] args) {
		SpringApplication.run(TxlcnEasymisApplication.class, args);
	}

}
