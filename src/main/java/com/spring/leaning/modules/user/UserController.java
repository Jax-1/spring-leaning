package com.spring.leaning.modules.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/User")
public class UserController {
    /**
     * 跳转到登录界面
     * @return
     */
    @RequestMapping("/login")
    public String toLogin(ModelAndView model,String error){
        System.out.print("action:login");
        model.addObject("msg","错误！");
        return "login";
    }
}
