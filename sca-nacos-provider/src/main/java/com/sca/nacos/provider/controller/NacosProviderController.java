package com.sca.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Aye
 * @Description:
 * @Date: Created in 16:51 2019/5/28
 * @Version: V1.0
 */
@RestController
public class NacosProviderController {

    @Value("${server.port}")
    private String port;
    @Value("${user.name}")
    private String name;
    @GetMapping(value = "/echo/{message}")
    public String echo (@PathVariable String message){
        return "hello "+message+"---port is "+port+"--name is"+name;
    }
}
