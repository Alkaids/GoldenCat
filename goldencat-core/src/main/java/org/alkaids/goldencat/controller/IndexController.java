package org.alkaids.goldencat.controller;
import com.alibaba.fastjson.JSONObject;
import org.alkaids.goldencat.core.Result;
import org.alkaids.goldencat.core.ResultGenerator;
import org.alkaids.goldencat.core.ServiceException;
import org.alkaids.goldencat.model.User;
import org.alkaids.goldencat.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.alkaids.goldencat.utils.MainUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户相关接口
* Created by gravel on 2018/06/10.
*/
@RestController
@RequestMapping(value = "/index")
public class IndexController {
    @Resource
    private UserService userService;

    @PostMapping(value = "/register")
    public Result register(User user) {
        User model = userService.findBy("userEmail",user.getUserEmail());
        if(model!=null){
            throw new ServiceException("该邮箱已被注册！");
        }
        user.setId(MainUtils.getUuid());
        //这里的加密方式要和security的加密方法一致
        user.setPassword(MainUtils.getBCryptStr(user.getPassword()));
        userService.save(user);
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 删除用户的接口暂时保留
     * @param id
     * @return
     */
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

    /**
     * 获取当前登录人的信息
     * @return
     */
    @PostMapping(value="/detail")
    public Result detail() {
        String principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        if (!principal.equals("")) {
            return ResultGenerator.genSuccessResult(JSONObject.parse(principal));
        } else {
            throw new ServiceException("获取当前登录用户信息失败！");
        }
    }  

}
