package com.cactus.springsecurity.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


@RestController
@RequestMapping("api/v1")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Welcome Cactus!!";
    }
}