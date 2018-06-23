package com.minnie.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import com.minnie.provider.service.HelloService;

/**
 * @author qiushengming
 * @date 2018/6/23
 */
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello() {
        System.out.println("hello wold!!!");
        return "hello wold!!!";
    }

}
