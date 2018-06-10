package org.alkaids.goldencat.controller;
import org.alkaids.goldencat.core.Result;
import org.alkaids.goldencat.core.ResultGenerator;
import org.alkaids.goldencat.model.AccountItem;
import org.alkaids.goldencat.service.AccountItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/06/10.
*/
@RestController
@RequestMapping("/account/item")
public class AccountItemController {
    @Resource
    private AccountItemService accountItemService;

    @PostMapping("/add")
    public Result add(AccountItem accountItem) {
        accountItemService.save(accountItem);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam String id) {
        accountItemService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(AccountItem accountItem) {
        accountItemService.update(accountItem);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam String id) {
        AccountItem accountItem = accountItemService.findById(id);
        return ResultGenerator.genSuccessResult(accountItem);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<AccountItem> list = accountItemService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
