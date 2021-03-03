package com.example.demo.security.config;

import com.example.demo.entity.GlManYg;
import com.example.demo.entity.UserInfo;
import com.example.demo.mapper.GlManYgMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户信息查询
 * @author liusj
 */
@Service
public class UserDetailsServiceImpl implements MyUserDetailsService {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    private GlManYgMapper glManYgMapper;

    @Autowired
    private HttpSession httpSession;

    @Override
    public UserDetails loadUserByUsername(String userCode) throws UsernameNotFoundException {
        Map<String, String> params = new HashMap<>(2);
        String comId = (String) httpSession.getAttribute("comId");
        params.put("comId", comId);
        params.put("userCode",userCode);
        GlManYg glManYg = glManYgMapper.findByUserCode(params);
        if(null == glManYg){
            LOGGER.info("用户{}不存在！",userCode);
            throw new UsernameNotFoundException(userCode);
        }
        //配置用户权限
        List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
        return new UserInfo(glManYg.getComId(), glManYg.getZgbh().trim(), glManYg.getPwd(), simpleGrantedAuthorities);
    }

    @Override
    public UserDetails loadUserByUsername(String comId, String username) throws UsernameNotFoundException {
        Map<String, String> params = new HashMap<>(2);
        params.put("comId", comId);
        params.put("userCode",username);
        GlManYg glManYg = glManYgMapper.findByUserCode(params);
        if(null == glManYg){
            LOGGER.info("用户{}不存在！",username);
            throw new UsernameNotFoundException(username);
        }
        List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
        return new UserInfo(glManYg.getComId(), glManYg.getZgbh().trim(), glManYg.getPwd(), simpleGrantedAuthorities);
    }
}
