package com.it.registrycentry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 表示我是一个服务注册中心，任何服务都需要到服务中心进行注册
public class RegistrycentryApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistrycentryApplication.class, args);
    }

}
