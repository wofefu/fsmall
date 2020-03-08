package com.fushuai.fsmall.user.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ApiModel(value="com-fushuai-fsmall-fsmalluser-pojo-UmsMemberReceiveAddress")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UmsMemberReceiveAddress {
    @ApiModelProperty(value="用户收货地址ID")
    private Long id;

    @ApiModelProperty(value="用户ID")
    private Long memberId;

    /**
    * 收货人名称
    */
    @ApiModelProperty(value="收货人名称")
    private String name;

    @ApiModelProperty(value="用户手机号")
    private String phoneNumber;

    /**
    * 是否为默认
    */
    @ApiModelProperty(value="是否为默认")
    private Integer defaultStatus;

    /**
    * 邮政编码
    */
    @ApiModelProperty(value="邮政编码")
    private String postCode;

    /**
    * 省份/直辖市
    */
    @ApiModelProperty(value="省份/直辖市")
    private String province;

    /**
    * 城市
    */
    @ApiModelProperty(value="城市")
    private String city;

    /**
    * 区
    */
    @ApiModelProperty(value="区")
    private String region;

    /**
    * 详细地址(街道)
    */
    @ApiModelProperty(value="详细地址(街道)")
    private String detailAddress;
}