package com.briup.cms.web.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @PostMapping("/authentication/form")
    @ApiOperation(value = "登陆逻辑", notes = "不需要输入令牌")
    public void login(String username,String password) {

    }
}
