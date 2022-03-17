package com.wufan.springcloud.controller;

import com.wufan.springcloud.entities.CommonResult;
import com.wufan.springcloud.entities.Payment;
import com.wufan.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j  //日志相关注解
public class PaymentController {

    @Autowired
    PaymentService paymentService;


    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create(Payment payment){
        int result = paymentService.create(payment);
        log.info("***插入结果:" + result);
        if(result>0){
            return new CommonResult(200,"插入数据库成功",result);
        }else {
            return new CommonResult(400,"插入数据库失败",null);
        }

    }

    @GetMapping(value = "/payment/get")
    public CommonResult<Payment> getPaymentById(@RequestParam("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("***插入结果:" + payment);
        if(payment!=null){
            return new CommonResult(200,"查询成功",payment);
        }else {
            return new CommonResult(400,"查询失败",null);
        }

    }
}

