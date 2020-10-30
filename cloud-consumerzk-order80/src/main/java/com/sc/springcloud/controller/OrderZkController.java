package com.sc.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description: 1
 * @author: 沈陈
 * @create: 2020-10-30 14:15
 **/
@RestController
@Slf4j
public class OrderZkController {

    public static final String INVOKER_URL = "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/zk")
    public String consumerZk() {
        return restTemplate.getForObject(INVOKER_URL + "/payment/zk", String.class);
    }

}
