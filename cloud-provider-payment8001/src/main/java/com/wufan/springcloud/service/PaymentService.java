package com.wufan.springcloud.service;

import com.wufan.springcloud.entities.Payment;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface PaymentService {

    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
