package com.foxwho.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/say.html")
    public @ResponseBody String say() {
        return "Spring Boot => say.html";
    }
}
