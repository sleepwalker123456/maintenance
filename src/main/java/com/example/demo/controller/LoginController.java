package com.example.demo.controller;

import com.example.demo.commons.CommUtils;
import com.example.demo.entity.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author liusj
 */
@Controller
public class LoginController {

    private final static Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    /**
     * 登录成功后跳转主页时的处理
     *
     * @return 主页
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() {
        LOGGER.info("登录成功，开始处理主页信息！");
        Authentication authentication = CommUtils.getUserInfo();
        return "main";
    }

    @RequestMapping("/login-error")
    public String error() {
        LOGGER.info("登录成功，开始处理主页信息！");
        return "login";
    }
}
