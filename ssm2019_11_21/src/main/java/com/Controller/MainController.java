package com.Controller;

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
    @Resource(name = "menuServiceImpl")
    MenuService menuService;

    @RequestMapping("/selectUser")
    public ModelAndView selectUser(HttpSession session) throws JsonProcessingException {
        ModelAndView modelAndView = new ModelAndView();
        User user=(User)session.getAttribute("user");
        List<Menu> menus = menuService.selectUserMenu(user);
        ObjectMapper objectMapper = new ObjectMapper();
        String menusJson= objectMapper.writeValueAsString(menus);
        menusJson= menusJson.replaceAll("\"pid\"", "\"pId\"");
        modelAndView.addObject("menusJson", menusJson);
        modelAndView.setViewName("main");
        return modelAndView;
    }
}
