package com.sca.nacos.consumer.feign.service.fallback;

import com.sca.nacos.consumer.feign.service.ProviderService;
import org.springframework.stereotype.Component;

/**
 * @Author Aye
 * @Description:
 * @Date: Created in 23:35 2019/5/28
 * @Version: V1.0
 */
@Component
public class ProviderServiceFallBack implements ProviderService {
    @Override
    public String echo(String message) {
        return "调用provider 失败 === sentinel fallback 触发";
    }
}
