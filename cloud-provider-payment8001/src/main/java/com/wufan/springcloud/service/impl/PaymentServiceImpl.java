package com.wufan.springcloud.service.impl;

import com.wufan.springcloud.dao.PaymentDao;
import com.wufan.springcloud.entities.Payment;
import com.wufan.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired //Spring提供  先 by name 后 by type
    //@Resource jdk提供  先 by type 后 by name
    PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(@Param("id") Long id) {
        return paymentDao.getPaymentById(id);
    }
}

