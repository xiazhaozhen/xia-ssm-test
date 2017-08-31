package com.ssm.controller.user;

import com.ssm.dmo.Test;
import com.ssm.dmo.User;
import com.ssm.service.UserService;
import com.ssm.unit.redis.RedisPoolManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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
    public String showUser(HttpServletRequest request, Model model){
        User user=userService.getUserById(1);
        System.out.println("testuser=="+test.getUserName());
        model.addAttribute("user",user);
        return "user/showUser";
    }

    @RequestMapping("/test")
    public String test(Model model){
        redisPoolManager.setCacheWithSec("name", "aa", 1000);
        System.out.println("1222222");
        System.out.println(redisPoolManager.getCache("name"));
        model.addAttribute("name",redisPoolManager.getCache("name"));
        return  "user/showUser";

    }

}
