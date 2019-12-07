package com.it.microservice04.callback;

import com.it.microservice04.service.MicroService01FeignTest;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 断路器返回处理
 *
 * @author czj
 * @date 2019/7/2 4:27 PM
 */
@Component
public class FallBackExample implements MicroService01FeignTest {

    //服务01不可用的时候，跳转到这里～
    @Override
    public String microService01FeignTest(@RequestParam("str") String str) {
        return "服务01不可用 error~" + str;
    }

}

