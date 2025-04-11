package com.pagena.client;

import com.damai.common.ApiResponse;
import com.damai.enums.BaseCode;

/**
 * @author yj
 * @date 2025/4/11 12:31
 */
public class CocoClientFallback implements CocoClient{
    @Override
    public ApiResponse<String> sayHello() {
        return ApiResponse.error(BaseCode.SYSTEM_ERROR);
    }
}
