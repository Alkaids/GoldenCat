package org.alkaids.goldencat.service;

import org.alkaids.goldencat.model.mapper.AccountItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Program Name: GoldenCat
 * <p>
 * Description:
 * <p>
 * Created by Zhang.Haixin on 2018/6/10
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
@Service(value = "accountService")
public class AccountService {

    @Autowired
    private AccountItemMapper accountItemMapper;

}
