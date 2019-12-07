package com.it.microservice01.service.impl;

import com.it.microservice01.service.MicroService01;
import org.springframework.stereotype.Service;

/**
 * 微服务01测试接口实现类
 */
@Service
public class MicroService01Impl implements MicroService01 {

    @Override
    public String MicroService01Test(String microService01Str) {
        return "我是MicroService01Copy -> " + microService01Str;
    }

}

