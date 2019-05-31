package com.sca.nacos.consumer.feign.service;

import com.sca.nacos.consumer.feign.service.fallback.ProviderServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author Aye
 * @Description:
 * @Date: Created in 22:34 2019/5/28
 * @Version: V1.0
 */
@FeignClient(value = "nacos-provider",fallback = ProviderServiceFallBack.class)
public interface ProviderService {

    //直接将provider的controller 贴过来 ,去掉方法体即可
    @GetMapping(value = "/echo/{message}")
    String echo (@PathVariable(value = "message") String message);
}
