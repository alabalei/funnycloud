package com.pagena.client;

import com.damai.common.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import static com.damai.constant.Constant.SPRING_INJECT_PREFIX_DISTINCTION_NAME;

/**
 * @author yj
 * @date 2025/4/11 12:30
 */
@Component
@FeignClient(value = SPRING_INJECT_PREFIX_DISTINCTION_NAME+"-"+"lucifa-service",fallback = LucifaClientFallback.class)
public interface LucifaClient {

    @GetMapping(value = "/lucifa/sayHello")
    ApiResponse<String> sayHello();
}
