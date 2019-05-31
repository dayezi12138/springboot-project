package com.zh.springweb.springweb.controller;

import com.zh.springweb.springweb.bean.HeadRightBean;
import com.zh.springweb.springweb.bean.TableBean;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {


    @PostMapping("/login")
    public String login(@RequestParam("userName") String userName, @RequestParam("password") String password, Map<String, Object> map, HttpSession session, RedirectAttributes redirectAttributes) {
        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
            map.put("h", "验证出错");
            return "login";
        }
        session.setAttribute("user", userName);
        redirectAttributes.addFlashAttribute("headRightBeans", headRightBeanList());
        return "redirect:main.html";
    }

    @GetMapping("/tables")
    public String tables(Map<String, Object> map) {
        map.put("list", tableBeans());
        return "tables";
    }

    private List<TableBean> tableBeans() {
        List<TableBean> list = new ArrayList<>();
        TableBean tableBean1 = new TableBean("Tiger Nixon", "System Architect", "Edinburgh", "61", "2011/04/25", "$320,800");
        list.add(tableBean1);
        list.add(tableBean1);
        list.add(tableBean1);
        list.add(tableBean1);
        list.add(tableBean1);
        list.add(tableBean1);
        list.add(tableBean1);


        return list;
    }

    private List<HeadRightBean> headRightBeanList() {
        List<HeadRightBean> headRightBeans = new ArrayList<>();
        HeadRightBean bean = new HeadRightBean("Profile");
        HeadRightBean bean1 = new HeadRightBean("Settings");
        HeadRightBean bean2 = new HeadRightBean("Activity Log");
        HeadRightBean bean3 = new HeadRightBean("Logout");
        headRightBeans.add(bean);
        headRightBeans.add(bean1);
        headRightBeans.add(bean2);
        headRightBeans.add(bean3);
        return headRightBeans;
    }
}
