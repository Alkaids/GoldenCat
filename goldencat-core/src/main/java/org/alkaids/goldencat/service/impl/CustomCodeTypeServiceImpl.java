package org.alkaids.goldencat.service.impl;

import org.alkaids.goldencat.mapper.CustomCodeTypeMapper;
import org.alkaids.goldencat.model.CustomCodeType;
import org.alkaids.goldencat.service.CustomCodeTypeService;
import org.alkaids.goldencat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/10.
 */
@Service
@Transactional
public class CustomCodeTypeServiceImpl extends AbstractService<CustomCodeType> implements CustomCodeTypeService {
    @Resource
    private CustomCodeTypeMapper customCodeTypeMapper;

}
