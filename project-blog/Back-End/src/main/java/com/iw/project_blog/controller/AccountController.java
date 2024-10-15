package com.iw.project_blog.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AccountController {

    @PostMapping("/login")
    public String login(@RequestBody String entity) {

        return entity;
    }

}
