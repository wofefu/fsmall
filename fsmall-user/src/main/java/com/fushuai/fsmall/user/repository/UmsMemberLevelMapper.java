package com.fushuai.fsmall.user.repository;

import com.fushuai.fsmall.user.pojo.UmsMemberLevel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UmsMemberLevelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLevel record);

    int insertSelective(UmsMemberLevel record);

    UmsMemberLevel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberLevel record);

    int updateByPrimaryKey(UmsMemberLevel record);
}