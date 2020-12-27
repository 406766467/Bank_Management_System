package com.sky.controller;

import com.sky.domain.RoleFunction;
import com.sky.domain.User;
import com.sky.service.RoleFunctionService;
import com.sky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RoleFunctionService roleFunctionService;

    @RequestMapping("public/login")
    public ModelAndView login(String username, String password){
        User user = userService.login(username, password);
        List<RoleFunction> functions = roleFunctionService.getFunctionByRoleId(user.getRoleId());
        ModelAndView modelAndView = new ModelAndView("index");
        if (user != null){
            modelAndView.addObject("user",user);
            modelAndView.addObject("functions",functions);
        }
        return modelAndView;
    }

    @RequestMapping("private/admin/findUser")
    public ModelAndView findUser(){
        List<User> users = userService.findUser();
        ModelAndView modelAndView = new ModelAndView("findUser");
        if (users != null){
            modelAndView.addObject("users",users);
        }
        return modelAndView;
    }
}
