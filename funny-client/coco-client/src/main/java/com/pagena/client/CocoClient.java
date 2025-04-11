package com.pagena.client;

import com.damai.common.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import static com.damai.constant.Constant.SPRING_INJECT_PREFIX_DISTINCTION_NAME;

/**
 * @author yj
 * @date 2025/4/11 12:30
 */
@Component
@FeignClient(value = SPRING_INJECT_PREFIX_DISTINCTION_NAME+"-"+"coco-service",fallback = CocoClientFallback.class)
public interface CocoClient {

    ApiResponse<String> sayHello();
}
