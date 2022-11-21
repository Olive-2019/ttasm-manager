package com.ttasm.manager.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("UserAccountController")
public class UserAccountController {
    @RequestMapping("Login")
    public String Login(String username, String password){
        return "";
    }
    @RequestMapping("Register")
    public String Register(String username, String password){
        return "";
    }
}
