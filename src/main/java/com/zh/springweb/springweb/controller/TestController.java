package com.zh.springweb.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class TestController {

    @Autowired
    private String test;

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("h", "<h1>111<h1>");
        return "222";
    }
}
