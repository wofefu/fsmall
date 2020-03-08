package com.fushuai.fsmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fushuai.fsmall.user.repository.UmsMemberLevelMapper;
import com.fushuai.fsmall.user.pojo.UmsMemberLevel;
import com.fushuai.fsmall.user.service.UmsMemberLevelService;
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService{

    @Resource
    private UmsMemberLevelMapper umsMemberLevelMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberLevelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMemberLevel record) {
        return umsMemberLevelMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsMemberLevel record) {
        return umsMemberLevelMapper.insertSelective(record);
    }

    @Override
    public UmsMemberLevel selectByPrimaryKey(Long id) {
        return umsMemberLevelMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMemberLevel record) {
        return umsMemberLevelMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMemberLevel record) {
        return umsMemberLevelMapper.updateByPrimaryKey(record);
    }

}
