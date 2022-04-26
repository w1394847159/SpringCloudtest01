package com.atguigu.myrule;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义负载均衡规则
 */
@Configuration
public class MySelfRule {

    //自定义随机规则
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }

}
