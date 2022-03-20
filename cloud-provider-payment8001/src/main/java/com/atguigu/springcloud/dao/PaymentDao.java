package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
@Mapper

public interface PaymentDao {

    public int create(Payment payment);

    //查询payment表，id为 bigint类型
    public Payment getPaymentById(@Param("id") Long id);

}
