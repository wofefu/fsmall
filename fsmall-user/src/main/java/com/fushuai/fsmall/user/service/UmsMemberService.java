package com.fushuai.fsmall.user.service;

import com.fushuai.fsmall.user.pojo.UmsMember;

import java.util.List;

public interface UmsMemberService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMember record);

    int insertSelective(UmsMember record);

    UmsMember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMember record);

    int updateByPrimaryKey(UmsMember record);

    List<UmsMember> getAllUser();
}
