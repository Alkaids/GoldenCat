package org.alkaids.goldencat.service.impl;

import org.alkaids.goldencat.mapper.AccountMapper;
import org.alkaids.goldencat.model.Account;
import org.alkaids.goldencat.service.AccountService;
import org.alkaids.goldencat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/10.
 */
@Service
@Transactional
public class AccountServiceImpl extends AbstractService<Account> implements AccountService {
    @Resource
    private AccountMapper accountMapper;

}
