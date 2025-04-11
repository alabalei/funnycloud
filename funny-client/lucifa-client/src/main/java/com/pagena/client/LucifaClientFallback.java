package com.pagena.client;

import com.damai.common.ApiResponse;
import com.damai.enums.BaseCode;
import org.springframework.stereotype.Component;

/**
 * @author yj
 * @date 2025/4/11 12:31
 */
@Component
public class LucifaClientFallback implements LucifaClient{
    @Override
    public ApiResponse<String> sayHello() {
        return ApiResponse.error(BaseCode.SYSTEM_ERROR);
    }
}
