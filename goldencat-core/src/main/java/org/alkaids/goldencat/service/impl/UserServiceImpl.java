package org.alkaids.goldencat.service.impl;

import org.alkaids.goldencat.mapper.UserMapper;
import org.alkaids.goldencat.model.User;
import org.alkaids.goldencat.service.UserService;
import org.alkaids.goldencat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/10.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
