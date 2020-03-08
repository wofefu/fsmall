package com.fushuai.fsmall.user.repository;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.fushuai.fsmall.user.pojo.UmsMemberReceiveAddress;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UmsMemberReceiveAddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberReceiveAddress record);

    int insertSelective(UmsMemberReceiveAddress record);

    UmsMemberReceiveAddress selectByPrimaryKey(Long id);

    List<UmsMemberReceiveAddress> selectByMemberId(@Param("memberId") Long memberId);


    int updateByPrimaryKeySelective(UmsMemberReceiveAddress record);

    int updateByPrimaryKey(UmsMemberReceiveAddress record);
}