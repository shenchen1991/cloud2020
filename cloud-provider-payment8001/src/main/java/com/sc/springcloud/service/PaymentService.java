package com.sc.springcloud.service;

import com.sc.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService
{
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}