package com.pagena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yj
 * @date 2025/4/11 12:17
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class CocoApplication {

    public static void main(String[] args) {
        System.setProperty("nacos.logging.default.config.enabled","false");
        SpringApplication.run(CocoApplication.class, args);
    }


}
