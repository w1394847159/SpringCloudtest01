package com.atguigu.springcloud.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//@Configuration
@SpringBootConfiguration
public class ApplicationContextConfig {

    @LoadBalanced //通过注册中心获取服务列表，远程调用，采用负载均衡（LB）
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
