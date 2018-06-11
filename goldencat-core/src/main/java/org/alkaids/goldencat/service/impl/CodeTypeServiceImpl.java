package org.alkaids.goldencat.service.impl;

import org.alkaids.goldencat.mapper.CodeTypeMapper;
import org.alkaids.goldencat.model.CodeType;
import org.alkaids.goldencat.service.CodeTypeService;
import org.alkaids.goldencat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/10.
 */
@Service
@Transactional
public class CodeTypeServiceImpl extends AbstractService<CodeType> implements CodeTypeService {
    @Resource
    private CodeTypeMapper codeTypeMapper;

}
