package com.it.microservice01.controller;

import com.it.microservice01.service.MicroService01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 微服务01控制层测试类
 */
@RestController
@RequestMapping("service01")
public class MicroService01Controller {

    @Autowired
    private MicroService01 microService01;

    @GetMapping("microService01Test")
    public String microService01Test(String str) {
        return microService01.MicroService01Test(str);
    }

}
