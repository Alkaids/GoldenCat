package org.alkaids.goldencat.controller;
import org.alkaids.goldencat.core.Result;
import org.alkaids.goldencat.core.ResultGenerator;
import org.alkaids.goldencat.model.CodeType;
import org.alkaids.goldencat.service.CodeTypeService;
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
@RequestMapping("/code/type")
public class CodeTypeController {
    @Resource
    private CodeTypeService codeTypeService;

    @PostMapping("/add")
    public Result add(CodeType codeType) {
        codeTypeService.save(codeType);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam String id) {
        codeTypeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(CodeType codeType) {
        codeTypeService.update(codeType);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam String id) {
        CodeType codeType = codeTypeService.findById(id);
        return ResultGenerator.genSuccessResult(codeType);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<CodeType> list = codeTypeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
