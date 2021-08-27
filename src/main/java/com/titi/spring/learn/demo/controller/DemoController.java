package com.titi.spring.learn.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bianyulong
 * @description
 * @date 2021/08/27
 */
@RestController
@RequestMapping("/demo")
@Api(value = "测试", tags = {"测试"})
public class DemoController {

    @ApiOperation(value = "rate limit", notes = "rate limit")
    @PostMapping(value = "/rate")
    public String executeNonSelectSql() {
        return "";
    }
}
