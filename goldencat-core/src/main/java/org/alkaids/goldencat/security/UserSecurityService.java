package org.alkaids.goldencat.security;

import org.alkaids.goldencat.mapper.UserMapper;
import org.alkaids.goldencat.model.User;
import org.alkaids.goldencat.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leebr on 2018/6/11.
 */
@Service
public class UserSecurityService implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private UserService userService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.debug("> loadUserByUsername");
        User temp = new User();
        temp.setUserName(username);
        User model = userService.findBy("userName",username);
//        List<User> users = userMapper.selectByCondition(temp);
        if (model == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        temp =model;
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        //用于添加用户的权限。只要把用户权限添加到authorities 就万事大吉。
        if (temp.getAuthority() != null) {
            authorities.add(new SimpleGrantedAuthority(temp.getAuthority()));
        }

        return new GcUserDetails(temp.getId(), temp.getUserName(), temp.getPassword(), temp.getUserEmail(), temp.getUserIcon(), true, authorities);
    }

}
