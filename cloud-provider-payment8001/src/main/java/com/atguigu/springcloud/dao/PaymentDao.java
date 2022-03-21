package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
@Mapper
@MapperScan("com.wufan.springcloud.dao") //扫描注解,与Mapper等价
public interface PaymentDao {

    public int create(Payment payment);

    //查询payment表，id为 bigint类型
     Payment getPaymentById(@Param("id") Long id);

}
