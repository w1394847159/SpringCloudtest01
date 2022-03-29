package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
//远程模块调用示例
@RestController
@Slf4j
public class OrderController {

    //本地8001提供服务的地址
    public static final String PAYMENT_URL="http://localhost:8001";


    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){

        //返回远程调用结果
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);

    }


    @GetMapping("/consumer/payment/get")
    public CommonResult<Payment> get(@RequestParam("id") Long id){

        System.out.println(id);
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get?id="+id,CommonResult.class);

    }
}
