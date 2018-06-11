package org.alkaids.goldencat.controller;
import org.alkaids.goldencat.core.Result;
import org.alkaids.goldencat.core.ResultGenerator;
import org.alkaids.goldencat.model.Account;
import org.alkaids.goldencat.service.AccountService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/06/10.
*/
@RestController
@RequestMapping("/account")
public class AccountController {
    @Resource
    private AccountService accountService;

    @PostMapping("/add")
    public Result add(Account account) {
        accountService.save(account);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam String id) {
        accountService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Account account) {
        accountService.update(account);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam String id) {
        Account account = accountService.findById(id);
        return ResultGenerator.genSuccessResult(account);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Account> list = accountService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
