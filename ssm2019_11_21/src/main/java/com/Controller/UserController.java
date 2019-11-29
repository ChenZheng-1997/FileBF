package com.Controller;

import com.domain.User;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;

@Controller
public class UserController {
    @Resource(name = "userServiceImpl")
    UserService userService;

    @RequestMapping("/userLogin")
    public String userLogin(HttpSession session, User user) {
        user = userService.selectUserLogin(user);
        if (user != null) {
            System.out.println(user.getUsername() + user.getUserpwd() + user.getId());
            session.setAttribute("user",user);
            return "redirect:/selectUser";
        } else {
            return "redirect:/jsp/userlogin.jsp";
        }


    }
@RequestMapping("/userloginimg")
    public void userLoginImg(){
    BufferedImage bufferedImage = new BufferedImage(100,60,BufferedImage.TYPE_INT_RGB);
    Graphics graphics = bufferedImage.getGraphics();
    graphics.setColor(Color.BLACK);
    graphics.drawString("1234",20,20);
}
}
