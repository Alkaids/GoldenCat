package org.alkaids.goldencat.controller;
import org.alkaids.goldencat.core.Result;
import org.alkaids.goldencat.core.ResultGenerator;
import org.alkaids.goldencat.model.Code;
import org.alkaids.goldencat.service.CodeService;
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
@RequestMapping("/ ")
public class CodeController {
    @Resource
    private CodeService codeService;

    @PostMapping("/add")
    public Result add(Code code) {
        codeService.save(code);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam String id) {
        codeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Code code) {
        codeService.update(code);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam String id) {
        Code code = codeService.findById(id);
        return ResultGenerator.genSuccessResult(code);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Code> list = codeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
