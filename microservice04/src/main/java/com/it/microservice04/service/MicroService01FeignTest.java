package com.it.microservice04.service;

import com.it.microservice04.callback.FallBackExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "MICROSERVICE01", fallback = FallBackExample.class)
public interface MicroService01FeignTest {
    @GetMapping("/service01/microService01Test")
    String microService01FeignTest(@RequestParam("str") String str);
}
