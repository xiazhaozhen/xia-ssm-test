package com.ssm.controller.user;

import com.ssm.dmo.Test;
import com.ssm.dmo.User;
import com.ssm.service.UserService;
import com.ssm.unit.StringUtils;
import com.ssm.unit.redis.RedisPoolManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by sgl on 17/8/17.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RedisPoolManager redisPoolManager;
    @Autowired
    private Test test;
    @RequestMapping("/showUser")
    @ResponseBody
    public String showUser(HttpServletRequest request, HttpSession session, Model model, String userName, String passWord){
        if(StringUtils.isBlank(userName)||StringUtils.isBlank(passWord)){
            return "登陆失败";
        }
        User user=userService.getUserById(1);
        System.out.println("testuser=="+test.getUserName());
        session.setAttribute("user",user);
        return "0";
    }

    @RequestMapping("/test")
    public String test(Model model){
        redisPoolManager.setCacheWithSec("name", "aa", 1000);
        System.out.println("1222222");
        System.out.println(redisPoolManager.getCache("name"));
        model.addAttribute("name",redisPoolManager.getCache("name"));
        return  "user/showUser";
    }
    @RequestMapping("toUser")
    public String toUser(){
        return "user/showUser";
    }
}
