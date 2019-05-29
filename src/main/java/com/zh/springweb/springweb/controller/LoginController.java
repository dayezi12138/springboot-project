package com.zh.springweb.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {


    @PostMapping("/login")
    public String login(@RequestParam("userName") String userName, @RequestParam("password") String password, Map<String, String> map, HttpSession session) {
        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
            map.put("h", "验证出错");
            return "login";
        }
        session.setAttribute("user", userName);
        return "redirect:main.html";
    }
}
