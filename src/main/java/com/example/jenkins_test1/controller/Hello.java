package com.example.jenkins_test1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shi
 * @Date: 2023/06/12/17:47
 * @Description:
 */

@Controller
@RequestMapping("/a")
public class Hello {

    @ResponseBody
    @GetMapping("/b")
    public String hello() {
        return "hello jenkins";
    }

}
