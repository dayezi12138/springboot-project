package com.zh.springweb.springweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/json")
public class MainController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Map<String, String> test() {
        Map map = new HashMap<String, String>();
        map.put("a", "b");
        return map;
    }
}
