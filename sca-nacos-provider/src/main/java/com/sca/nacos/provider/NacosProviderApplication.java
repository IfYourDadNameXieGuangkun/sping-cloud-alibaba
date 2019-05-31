package com.sca.nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author Aye
 * @Description:
 * @Date: Created in 16:48 2019/5/28
 * @Version: V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
public class NacosProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosProviderApplication.class,args);
    }
}
