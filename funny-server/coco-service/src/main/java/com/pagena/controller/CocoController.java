package com.pagena.controller;

import com.damai.common.ApiResponse;
import com.pagena.service.CocoService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yj
 * @date 2025/4/11 12:04
 */

@RestController
@RequestMapping("/coco")
public class CocoController {

    @Resource
    private CocoService cocoService;

    @GetMapping
    public ApiResponse<String> hellow() {
        return ApiResponse.ok("我是Coco船长");
    }



    @GetMapping("/toLucifa")
    public ApiResponse<String> toLucifa() {
        return cocoService.toLucifa();
    }

}
