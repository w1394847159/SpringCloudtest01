package com.atguigu.springcloud;

import com.atguigu.myrule.MySelfRule;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * SpringBoot启动类
 */
@SpringBootApplication
@MapperScan("com.atguigu.springcloud.dao") //扫描注解,与Mapper等价
@ComponentScan(basePackages = "com.atguigu.springcloud")
@EnableEurekaClient
@RibbonClient(name = "cloud-payment-service",configuration = MySelfRule.class) //Ribbon配置，指定负载均衡的服务名以及自定义配置类
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);

    }
}
