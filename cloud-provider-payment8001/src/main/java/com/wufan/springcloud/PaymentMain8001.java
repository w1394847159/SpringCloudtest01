package com.wufan.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * SpringBoot启动类
 */
@SpringBootApplication
@MapperScan("com.wufan.springcloud.dao") //扫描注解,与Mapper等价
@ComponentScan(basePackages = "com.wufan.springcloud")
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);

    }
}
