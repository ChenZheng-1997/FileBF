package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    /**
     * 查询当前用户的登陆菜单
     * @return
     */
    @RequestMapping("/selectusermeun")
    public String selectUserMeun() {
        return "main";
    }
}
