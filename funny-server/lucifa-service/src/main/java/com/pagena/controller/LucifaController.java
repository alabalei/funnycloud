package com.pagena.controller;

import com.damai.common.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

/**
 * @author yj
 * @date 2025/4/10 19:28
 */
@RestController
@RequestMapping("/lucifa")
public class LucifaController {

    @GetMapping("/sayHello")
    public ApiResponse<String> hellow() {
        return ApiResponse.ok("我是路西法");
    }


    @GetMapping()
    public ApiResponse<String> test() {
        return ApiResponse.ok("滴滴滴滴滴滴滴滴");
    }
}
