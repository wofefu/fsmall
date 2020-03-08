package com.fushuai.fsmall.user.service;

import com.fushuai.fsmall.user.pojo.UmsMemberLevel;
public interface UmsMemberLevelService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLevel record);

    int insertSelective(UmsMemberLevel record);

    UmsMemberLevel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberLevel record);

    int updateByPrimaryKey(UmsMemberLevel record);

}
