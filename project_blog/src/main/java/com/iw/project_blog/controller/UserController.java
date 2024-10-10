package com.iw.project_blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iw.project_blog.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author iw
 * @since 2024-10-10
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/{id}")
    @ResponseBody
    public Object test(@PathVariable("id") Long id) {
        return userService.getById(id);
    }
}
