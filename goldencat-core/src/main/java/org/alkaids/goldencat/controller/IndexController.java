package org.alkaids.goldencat.controller;
import org.alkaids.goldencat.core.Result;
import org.alkaids.goldencat.core.ResultGenerator;
import org.alkaids.goldencat.core.ServiceException;
import org.alkaids.goldencat.model.User;
import org.alkaids.goldencat.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.alkaids.goldencat.utils.MainUtils;
import org.springframework.ui.Model;
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
@RequestMapping(value = "/index")
public class IndexController {
    @Resource
    private UserService userService;

    @PostMapping(value = "/login")
    public Result login(User user) {
        User temp = userService.findByModel(user);
        return ResultGenerator.genSuccessResult(temp);
    }

    @PostMapping(value = "/register")
    public Result register(User user) {
        User model = userService.findBy("userEmail",user.getUserEmail());
        if(model!=null){
            throw new ServiceException("该邮箱已被注册！");
        }
        user.setId(MainUtils.getUuid());
        user.setPassword(MainUtils.getBCryptStr(user.getPassword()));
        userService.save(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping(value = "/delete")
    public Result delete(@RequestParam String id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping(value = "/update")
    public Result update(User user) {
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping(value="/detail")
    public Result detail(@RequestParam String id) {
        User user = userService.findById(id);
        return ResultGenerator.genSuccessResult(user);
    }

    @PostMapping(value = "/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
