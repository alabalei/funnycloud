package com.pagena.service;

import com.damai.common.ApiResponse;
import com.pagena.client.LucifaClient;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author yj
 * @date 2025/4/11 13:03
 */
@Service
public class CocoService {

    @Autowired
    private LucifaClient lucifaClient;

    public ApiResponse<String> toLucifa(){
       return lucifaClient.sayHello();
    }
}
