package com.sca.nacos.consumer.feign.controller;

import com.sca.nacos.consumer.feign.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Aye
 * @Description:
 * @Date: Created in 22:38 2019/5/28
 * @Version: V1.0
 */
@RestController
public class NacosConsumerFeighController {
    @Autowired
    private ProviderService providerService;

    @GetMapping(value = "/consumer/echo/{message}")
    public String echo(@PathVariable("message") String message){
        return providerService.echo(message+"feign");

    }
}
