package org.easymis.base.gateway.config;

import org.easymis.base.gateway.filter.JwtCheckGatewayFilterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 应用配置
* @ClassName: AppConfig
* @Description: TODO(这里用一句话描述这个类的作用)
* @author lenovo-t
* @date 2019年5月22日
*
 */
@Configuration
public class AppConfig {
    @Bean
    public JwtCheckGatewayFilterFactory jwtCheckGatewayFilterFactory(){
        return new JwtCheckGatewayFilterFactory();
    }
}
