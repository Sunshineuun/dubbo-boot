package com.minnie.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;

import com.minnie.consumer.service.HelloConsumerService;
import com.minnie.provider.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author qiushengming
 * @date 2018/6/23
 */
@Component
public class HelloConsumerServiceImpl implements HelloConsumerService {

    @Reference(version = "1.0.0")
    private HelloService helloService;

    @Override
    public void helloConsumer() {
        helloService.hello();
    }
}
