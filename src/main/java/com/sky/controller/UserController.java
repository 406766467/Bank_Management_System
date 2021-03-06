package com.sky.controller;

import com.sky.domain.Money;
import com.sky.domain.RoleFunction;
import com.sky.domain.User;
import com.sky.domain.ZhuanZhang;
import com.sky.service.RoleFunctionService;
import com.sky.service.UserOperationService;
import com.sky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RoleFunctionService roleFunctionService;

    @Autowired
    private UserOperationService userOperationService;

    //登录
    @RequestMapping("public/login")
    public ModelAndView login(String username, String password,HttpSession session){
        User user = userService.login(username, password);
        List<RoleFunction> functions = roleFunctionService.getFunctionByRoleId(user.getRoleId());
        ModelAndView modelAndView = new ModelAndView("index");
        if (user != null){
            session.setAttribute("user01",user);
            modelAndView.addObject("user",user);
            modelAndView.addObject("functions",functions);
        }
        return modelAndView;
    }

    //查询用户
    @RequestMapping("private/admin/findUser")
    public ModelAndView findUser(){
        List<User> users = userService.findUser();
        ModelAndView modelAndView = new ModelAndView("findUser");
        if (users != null){
            modelAndView.addObject("users",users);
        }
        return modelAndView;
    }

    //根据身份证号查询用户
    @RequestMapping("private/admin/findUserByIdCard")
    public ModelAndView findUserByIdCard(String idCard){
        List<User> users = userService.findUserByIdCard(idCard);
        ModelAndView modelAndView = new ModelAndView("findUser");
        if (users != null){
            modelAndView.addObject("users",users);
        }
        return modelAndView;
    }

    //转到addUser.jsp
    @RequestMapping("private/admin/toAddUser")
    public ModelAndView toAddUser(){
        return new ModelAndView("addUser");
    }

    //添加用户
    @RequestMapping("private/admin/addUser")
    public ModelAndView addUser(User user){
        userService.addUser(user);
        ModelAndView modelAndView = new ModelAndView("findUser");
        List<User> users = userService.findUser();
        modelAndView.addObject("users",users);
        return modelAndView;
    }

    //删除用户根据ID
    @RequestMapping("private/admin/deleteUserById")
    public ModelAndView deleteUserById(Integer id){
        userService.deleteUserById(id);
        ModelAndView modelAndView = new ModelAndView("findUser");
        List<User> users = userService.findUser();
        modelAndView.addObject("users",users);
        return modelAndView;
    }

    //修改用户信息
    @RequestMapping("private/admin/updateUserById")
    public ModelAndView updateUserById(User user){
        userService.updateUserById(user);
        ModelAndView modelAndView = new ModelAndView("findUser");
        List<User> users = userService.findUser();
        modelAndView.addObject("users",users);
        return modelAndView;
    }

    //跳转updateUser.jsp
    @RequestMapping("private/admin/toUpdateUser")
    public ModelAndView toUpdateUser(User user){
        ModelAndView modelAndView = new ModelAndView("updateUser");
        modelAndView.addObject("user",user);
        return modelAndView;
    }

    //用户查询取款信息
    @RequestMapping("private/User/findallWithDrawal")
    public ModelAndView findallWithDrawal(HttpServletRequest request){
        HttpSession session=request.getSession();
        User user=(User) session.getAttribute("user01");
        String name=user.getName();
        List<Money> monies = userOperationService.selectAllWithdrawal(name);
        ModelAndView modelAndView = new ModelAndView("withdrawal");
        if (monies != null){
            modelAndView.addObject("monies",monies);
        }
        return modelAndView;
    }
    //用户查询存款信息
    @RequestMapping("private/User/findallDeposit")
    public ModelAndView findallDeposit(HttpServletRequest request){
        HttpSession session=request.getSession();
        User user=(User) session.getAttribute("user01");
        String name=user.getName();
        List<Money> monies = userOperationService.selectAllDeposit(name);
        ModelAndView modelAndView = new ModelAndView("deposit");
        if (monies != null){
            modelAndView.addObject("monies",monies);
        }
        return modelAndView;
    }
    //查看个人信息
    @RequestMapping("private/User/findUserInfo")
    public ModelAndView findUserInfo(){
        ModelAndView modelAndView = new ModelAndView("UserInfo");
        return modelAndView;
    }

    //查看转账记录
    @RequestMapping("private/User/findUserZhuanZhuang")
    public ModelAndView findUserZhuanZhuang(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView("ZhuanZhang");
        HttpSession session=request.getSession();
        User user=(User) session.getAttribute("user01");
        String bankcard=user.getBankcard();
        List<ZhuanZhang> zhuanZhang=userOperationService.selectTransferAccounts(bankcard);
        if (zhuanZhang != null){
            modelAndView.addObject("zhuanZhang",zhuanZhang);
        }
        return modelAndView;
    }



}
