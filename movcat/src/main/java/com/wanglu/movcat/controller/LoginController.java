package com.wanglu.movcat.controller;

import com.wanglu.movcat.model.IdentifyingCode;
import com.wanglu.movcat.model.Result;
import com.wanglu.movcat.model.User;
import com.wanglu.movcat.service.UserService;
import com.wanglu.movcat.util.Md5Utils;
import com.wanglu.movcat.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 登录
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public Result login(HttpServletRequest request, String telOrEmail, String password) {
        if (!StringUtils.hasText(telOrEmail)){
            return ResultUtil.error("请输入手机号或邮箱");
        }
        if (!StringUtils.hasText(password)){
            return ResultUtil.error("请输入密码");
        }
        if (userService.findByTelOrEmail(telOrEmail)){
            User user = userService.findByPasswordAndTelOrEmail(telOrEmail, Md5Utils.MD5Encode(password, "utf-8", false));
            if (user == null){
                return ResultUtil.error("用户不存在");
            }else {
                request.getSession().setAttribute("LOGIN_USER", user);
                return ResultUtil.success("登录成功");
            }
        }else {
            return ResultUtil.error("用户不存在");
        }
    }


    /**
     * 注册——发送验证码
     * @return
     */
    @PostMapping("/sendCode")
    @ResponseBody
    public Result sendCode(HttpServletRequest request, String telOrEmail) {
        if (!StringUtils.hasText(telOrEmail)){
            return ResultUtil.error("请输入手机号或邮箱");
        }
        int code = (int) ((Math.random() * 9 + 1) * 100000);
        System.out.println(code);
        request.getSession().setAttribute("IDENTIFYING_CODE", new IdentifyingCode(telOrEmail, String.valueOf(code), new Date()));
        request.getSession().setMaxInactiveInterval(60);
        return ResultUtil.success("验证码发送成功");
    }


    /**
     * 注册
     * @return
     */
    @PostMapping("/register")
    @ResponseBody
    public Result sendCode(HttpServletRequest request, String telOrEmail, String name, String password, String code) {
        if (!StringUtils.hasText(telOrEmail)){
            return ResultUtil.error("请输入手机号或邮箱");
        }
        if (!StringUtils.hasText(code)){
            return ResultUtil.error("请输入验证码");
        }
        if (!StringUtils.hasText(password)){
            return ResultUtil.error("请输入密码");
        }
        IdentifyingCode identifyingCode = (IdentifyingCode) request.getSession().getAttribute("IDENTIFYING_CODE");
        if (identifyingCode == null){
            return ResultUtil.error("验证码过期");
        }
        if (!telOrEmail.equals(identifyingCode.getTel())){
            return ResultUtil.error("注册手机号或邮箱与发送验证码的不一致");
        }

        if (!code.equals(identifyingCode.getCode())){
            return ResultUtil.error("验证码错误");
        }
        if (userService.findByTelOrEmail(telOrEmail)){
            return ResultUtil.error("该手机号或邮箱已注册");
        }
        User user = userService.saveUser(new User(name, telOrEmail, telOrEmail, Md5Utils.MD5Encode(password, "utf-8", false)));
        if (user != null){
            request.getSession().setAttribute("LOGIN_USER", user);
            return ResultUtil.success("注册成功");
        }else {
            return ResultUtil.error("注册失败，请重新注册");
        }
    }
}
