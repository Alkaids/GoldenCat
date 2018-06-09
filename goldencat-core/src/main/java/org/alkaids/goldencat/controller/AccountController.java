package org.alkaids.goldencat.controller;

import org.alkaids.goldencat.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Program Name: GoldenCat
 * <p>
 * Description: 记账主控
 * <p>
 * Created by Zhang.Haixin on 2018/6/10
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
@RestController
@RequestMapping(value = "/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

}
