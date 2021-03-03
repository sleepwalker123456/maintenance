package com.example.demo.commons;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author liusj
 */
public class CommUtils {

    /**
     * 获取当前用户信息
     * @return 用户信息
     */
    public static Authentication getUserInfo(){
        SecurityContext securityContext = SecurityContextHolder.getContext();
        return securityContext.getAuthentication();
    }

}
