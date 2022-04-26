package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j  //日志相关注解
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    //获取配置文件中的端口号
    @Value("${server.port}")
    String port;

    //只要是json方式，就使用RequestBody获取对象
    @PostMapping(value = "/payment/create")
    @ResponseBody
    public CommonResult<Payment> create(@RequestBody Payment payment){
        log.info("结果" + payment.getSerial());
        int result = paymentService.create(payment);
        log.info("***插入结果:" + result);
        if(result>0){
            return new CommonResult(200,"插入数据库成功",result);
        }else {
            return new CommonResult(400,"插入数据库失败",null);
        }

    }


    @GetMapping(value = "/payment/get")
    @ResponseBody
    public CommonResult<Payment> getPaymentById(@RequestParam("id") Long id){
        System.out.println("port="+port);
        Payment payment = paymentService.getPaymentById(id);
        log.info("***插入结果:" + payment);


        if(payment!=null){
            return new CommonResult(200,"查询成功",payment);
        }else {
            return new CommonResult(400,"查询失败",null);
        }

    }
}

