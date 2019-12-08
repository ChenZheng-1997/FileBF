package com.controller;

import com.domain.Menu;
import com.domain.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
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
    public ModelAndView selectUserMeun(HttpSession session) throws JsonProcessingException {

        ModelAndView modelAndView = new ModelAndView();

        // 获取session里面的菜单
        User user = (User) session.getAttribute("user");

        // 模拟用户从登陆的session里面获取用户
        //根据登陆的用户id匹配对应的目录
        List<Menu> menus = menuService.selectUserMenu(user);
        System.out.println("menu// username:" + user.getUsername() + "\tpassword:" + user.getPassword() + "\tid:" + user.getId());
        //将菜单list集合转变为字符串让前端json可以读取
        ObjectMapper objectMapper = new ObjectMapper();
        String menuJson = objectMapper.writeValueAsString(menus);
        // 将json格式里面的pid变成pId，为了使前端树读取name保持一致
        menuJson = menuJson.replaceAll("pid", "pId");

        modelAndView.addObject("menuJson", menuJson);
        modelAndView.setViewName("main");//设置转发路径
        return modelAndView;
    }
}
