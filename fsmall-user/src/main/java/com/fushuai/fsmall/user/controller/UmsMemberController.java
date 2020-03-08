package com.fushuai.fsmall.user.controller;

import com.fushuai.fsmall.user.pojo.UmsMember;
import com.fushuai.fsmall.user.pojo.UmsMemberReceiveAddress;
import com.fushuai.fsmall.user.service.UmsMemberReceiveAddressService;
import com.fushuai.fsmall.user.service.UmsMemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UmsMemberController {
    private final UmsMemberService umsMemberService;
    private final UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    public UmsMemberController(UmsMemberService umsMemberService, UmsMemberReceiveAddressService umsMemberReceiveAddressService) {
        this.umsMemberService = umsMemberService;
        this.umsMemberReceiveAddressService = umsMemberReceiveAddressService;
    }

    @GetMapping("/selectByMemberId")
    @ResponseBody
    public  List<UmsMemberReceiveAddress> selectByMemberId( Long memberId){
         return umsMemberReceiveAddressService.selectByMemberId(memberId);
    }
    @GetMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {
        return umsMemberService.getAllUser();
    }
}
