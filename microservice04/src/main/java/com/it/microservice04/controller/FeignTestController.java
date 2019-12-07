package com.it.microservice04.controller;

import com.it.microservice04.service.MicroService01FeignTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("service04")
public class FeignTestController {

    @Autowired
    private MicroService01FeignTest microService01FeignTest;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("feignTest01")
    public String feignTest01(String str) {
        String result01 = microService01FeignTest.microService01FeignTest(str);
        return "我是service04，调用 service01 success -> " + result01;
    }

    @GetMapping("gatewayTest")
    public String gatewayTest() {
        String s = restTemplate.getForObject("http://MICROSERVICE01/service01/microService01Test", String.class);
        return "service4通过gateway访问service1 success" + s;


    }
}

