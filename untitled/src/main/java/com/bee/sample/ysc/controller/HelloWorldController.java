package com.bee.sample.ysc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @RequestMapping("/say")
    public @ResponseBody String say()
    {
        return "Hello Spring Boot";
    }
}
