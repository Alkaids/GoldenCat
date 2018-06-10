package org.alkaids.goldencat.controller;
import org.alkaids.goldencat.core.Result;
import org.alkaids.goldencat.core.ResultGenerator;
import org.alkaids.goldencat.core.ServiceException;
import org.alkaids.goldencat.model.User;
import org.alkaids.goldencat.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.alkaids.goldencat.utils.MainUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by gravel on 2018/06/10.
*/
@RestController
@RequestMapping("/index")
public class IndexController {
    @Resource
    private UserService userService;

    @PostMapping("/login")
    public Result login(User user) {
        User model = userService.findByModel(user);
        if(!MainUtils.getSHA256Str(user.getPassword()).equals(model.getPassword())){
            throw new ServiceException("用户邮箱或者密码错误！");
        }
        return ResultGenerator.genSuccessResult(model);
    }

    @PostMapping("/register")
    public Result register(User user) {
        user.setId(MainUtils.getUuid());
        user.setPassword(MainUtils.getSHA256Str(user.getPassword()));
        userService.save(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam String id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(User user) {
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam String id) {
        User user = userService.findById(id);
        return ResultGenerator.genSuccessResult(user);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
