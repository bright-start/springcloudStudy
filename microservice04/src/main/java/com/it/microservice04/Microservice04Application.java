package com.it.microservice04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient // 表示我是一个服务
@EnableFeignClients // 表示我可以调用其他服务 如果一个服务想调用另一个服务，则必须加上此注解
public class Microservice04Application {

    public static void main(String[] args) {
        SpringApplication.run(Microservice04Application.class, args);
    }

}
