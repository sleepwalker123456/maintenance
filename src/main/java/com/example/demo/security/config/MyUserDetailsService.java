package com.example.demo.security.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author liusj
 */
public interface MyUserDetailsService extends UserDetailsService {

    /**
     * 新增组织参数
     * @param comId 组织参数
     * @param var1 用户名
     * @return 用户信息
     * @throws UsernameNotFoundException 抛出异常UsernameNotFoundException
     */
    UserDetails loadUserByUsername(String comId,String var1) throws UsernameNotFoundException;
}
