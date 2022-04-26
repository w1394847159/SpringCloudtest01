package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * SpringBoot启动类
 */
@SpringBootApplication
@MapperScan("com.atguigu.springcloud.dao") //扫描注解,与Mapper等价
@ComponentScan(basePackages = "com.atguigu.springcloud")
@EnableEurekaClient
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);

    }
}
