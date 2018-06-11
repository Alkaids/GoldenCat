package org.alkaids.goldencat.controller;
import org.alkaids.goldencat.core.Result;
import org.alkaids.goldencat.core.ResultGenerator;
import org.alkaids.goldencat.model.CustomCodeType;
import org.alkaids.goldencat.service.CustomCodeTypeService;
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
@RequestMapping("/custom/code/type")
public class CustomCodeTypeController {
    @Resource
    private CustomCodeTypeService customCodeTypeService;

    @PostMapping("/add")
    public Result add(CustomCodeType customCodeType) {
        customCodeTypeService.save(customCodeType);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam String id) {
        customCodeTypeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(CustomCodeType customCodeType) {
        customCodeTypeService.update(customCodeType);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam String id) {
        CustomCodeType customCodeType = customCodeTypeService.findById(id);
        return ResultGenerator.genSuccessResult(customCodeType);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<CustomCodeType> list = customCodeTypeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
