package com.sc.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: cloud2020
 * @description: 1
 * @author: 沈陈
 * @create: 2020-10-30 13:44
 **/
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

//    @Resource
//    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/payment/consul")
    public String paymentConsul() {
        return "Springcloud with consul: " + serverPort + "\t" + UUID.randomUUID().toString();

    }

}
