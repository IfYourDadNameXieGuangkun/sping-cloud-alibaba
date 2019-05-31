package com.sca.nacos.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Aye
 * @Description:
 * @Date: Created in 17:31 2019/5/28
 * @Version: V1.0
 * 实现服务之间的调用,最原始的方式
 * LoadBalanceClient 和 RestTemplate 结合的方式来访问。
 */
@RestController
public class NacosConsumerController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;

    @Value("${spring.application.name}")
    private String appName;
    @GetMapping(value = "/echo/app/name")
    public String echo(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-provider");
        String url = String.format("http://%s:%s/echo/%s",serviceInstance.getHost(),serviceInstance.getPort(),appName);
        return restTemplate.getForObject(url,String.class);
    }
}
