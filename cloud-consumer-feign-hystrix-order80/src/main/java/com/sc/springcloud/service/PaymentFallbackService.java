package com.sc.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @program: cloud2020
 * @description:
 * @author: 沈陈
 * @create: 2020-11-02 16:39
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentOk(Integer id) {
        return "paymentOk fall back";
    }

    @Override
    public String paymentTime(Integer id) {
        return "paymentTime fall back";
    }
}
