package com.fushuai.fsmall.user.service;

import com.fushuai.fsmall.user.pojo.UmsMemberReceiveAddress;

import java.util.List;

public interface UmsMemberReceiveAddressService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberReceiveAddress record);

    int insertSelective(UmsMemberReceiveAddress record);

    UmsMemberReceiveAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberReceiveAddress record);

    int updateByPrimaryKey(UmsMemberReceiveAddress record);

    List<UmsMemberReceiveAddress> selectByMemberId(Long memberId);
}
