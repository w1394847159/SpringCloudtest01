package com.atguigu.springcloud.service;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * 创建远程服务调用Feign接口
 */

@Component //作为一个组件
@FeignClient(value = "cloud-payment-service") //作为Feign访问客户端,指定延迟调用微服务名称
public interface PaymentFeignService {

    //将服务方Controller方法作为接口的实现类，因此直接将Controller方法的方法头粘贴
    //只要是json方式，就使用RequestBody获取对象
    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment);

    @GetMapping(value = "/payment/get")
    public CommonResult<Payment> getPaymentById(@RequestParam("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
