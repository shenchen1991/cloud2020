package com.sc.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud2020
 * @description: 轮询规则
 * @author: 沈陈
 * @create: 2020-10-30 16:16
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();// 定义为随机
    }
}
