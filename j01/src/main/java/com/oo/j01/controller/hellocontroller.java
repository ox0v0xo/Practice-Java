package com.oo.j01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class hellocontroller {

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "123hello123world";
    }
}
