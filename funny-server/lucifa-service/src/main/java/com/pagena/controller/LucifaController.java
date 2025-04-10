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

    @GetMapping
    public ApiResponse<String> hellow() {
        return ApiResponse.ok("你好你好");
    }
}
