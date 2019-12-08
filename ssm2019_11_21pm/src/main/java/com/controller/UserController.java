package com.controller;

import com.domain.User;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@Controller
public class UserController {

    @Resource(name = "userServiceImpl")
    UserService userService;

    /**
     * 用户登陆controller
     *
     * @param session
     * @param user
     * @return
     */
    @RequestMapping("/userlogin")
    public String userLogin(HttpSession session, User user, String imgcheck) {
        String s = (String) session.getAttribute("imgcheck");//获取登陆时输入的验证码
        if (s.equals(imgcheck)) {//判断验证码输入时候正确
            user = userService.selectOneUserNameAndUserPassword(user);
            if (user != null) {
                System.out.println("login//  username:" + user.getUsername() + "\tpassword:" + user.getPassword() + "\tid:" + user.getId());
                session.setAttribute("user", user);
                return "redirect:selectusermeun";
            } else {
                return "redirect:index.jsp";
            }
        } else {
            return "redirect:index.jsp";
        }
    }


    @RequestMapping("/userloginimgcheck")
    public void userLoginImgCheck(HttpSession session, HttpServletResponse response) throws IOException {
        BufferedImage bufferedImage = new BufferedImage(60, 30, BufferedImage.TYPE_INT_RGB);// 创建内存图像
        Graphics graphics = bufferedImage.getGraphics();// 获取图形上下文
        graphics.setColor(Color.RED);// 设置背景颜色
        graphics.setFont(new Font("宋体", 12, 24));

        Random random = new Random();
        int r = random.nextInt(9000) + 1000;
        graphics.drawString(r + "", 6, 20);// 将验证码字符显示到图象中

        //把生成的验证码数字发送到session里，登陆的时候能获取提交
        session.setAttribute("userloginimgcheck", r);
        graphics.dispose();
        ImageIO.write(bufferedImage, "jpg", response.getOutputStream());
    }
}
