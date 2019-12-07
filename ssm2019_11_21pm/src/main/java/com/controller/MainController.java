package com.controller;

import com.domain.Menu;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MainController {
    // 通过@Resource完成从spring配置文件中查找名称为menuServiceImpl的bean来装配字段menuService
    @Resource(name = "menuServiceImpl")
    MenuService menuService;

    /**
     * 查询当前用户的登陆菜单
     *
     * @return
     */
    @RequestMapping("/selectusermeun")
    public ModelAndView selectUserMeun() throws JsonProcessingException {

        ModelAndView modelAndView = new ModelAndView();
        //根据登陆的用户匹配对应的目录
        List<Menu> menus = menuService.selectUserMenu();

        //将list集合转变为字符串让前端json可以读取
        ObjectMapper objectMapper = new ObjectMapper();
        String menuJson = objectMapper.writeValueAsString(menus);
        menuJson = menuJson.replaceAll("pid", "pId");

        modelAndView.addObject("menuJson", menuJson);
        modelAndView.setViewName("main");//设置转发路径
        return modelAndView;
    }
}
