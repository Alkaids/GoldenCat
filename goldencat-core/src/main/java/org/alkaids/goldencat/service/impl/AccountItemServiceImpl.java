package org.alkaids.goldencat.service.impl;

import org.alkaids.goldencat.mapper.AccountItemMapper;
import org.alkaids.goldencat.model.AccountItem;
import org.alkaids.goldencat.service.AccountItemService;
import org.alkaids.goldencat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/10.
 */
@Service
@Transactional
public class AccountItemServiceImpl extends AbstractService<AccountItem> implements AccountItemService {
    @Resource
    private AccountItemMapper accountItemMapper;

}
