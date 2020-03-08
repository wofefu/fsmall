package com.fushuai.fsmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fushuai.fsmall.user.pojo.UmsMember;
import com.fushuai.fsmall.user.repository.UmsMemberMapper;
import com.fushuai.fsmall.user.service.UmsMemberService;

import java.util.List;

@Service
public class UmsMemberServiceImpl implements UmsMemberService{

    @Resource
    private UmsMemberMapper umsMemberMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMember record) {
        return umsMemberMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsMember record) {
        return umsMemberMapper.insertSelective(record);
    }

    @Override
    public UmsMember selectByPrimaryKey(Long id) {
        return umsMemberMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMember record) {
        return umsMemberMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMember record) {
        return umsMemberMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<UmsMember> getAllUser() {
        return umsMemberMapper.getAllUser();
    }

}
