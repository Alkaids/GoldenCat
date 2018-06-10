package org.alkaids.goldencat.service.impl;

import org.alkaids.goldencat.mapper.CodeMapper;
import org.alkaids.goldencat.model.Code;
import org.alkaids.goldencat.service.CodeService;
import org.alkaids.goldencat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/10.
 */
@Service
@Transactional
public class CodeServiceImpl extends AbstractService<Code> implements CodeService {
    @Resource
    private CodeMapper codeMapper;

}
