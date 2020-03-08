package com.fushuai.fsmall.user.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ApiModel(value="com-fushuai-fsmall-fsmalluser-pojo-UmsMemberLevel")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UmsMemberLevel {
    @ApiModelProperty(value="用户等级ID")
    private Long id;

    @ApiModelProperty(value="名字")
    private String name;

    @ApiModelProperty(value="增长点")
    private Integer growthPoint;

    /**
    * 是否为默认等级：0->不是；1->是
    */
    @ApiModelProperty(value="是否为默认等级：0->不是；1->是")
    private Integer defaultStatus;

    /**
    * 免运费标准
    */
    @ApiModelProperty(value="免运费标准")
    private BigDecimal freeFreightPoint;

    /**
    * 每次评价获取的成长值
    */
    @ApiModelProperty(value="每次评价获取的成长值")
    private Integer commentGrowthPoint;

    /**
    * 是否有免邮特权
    */
    @ApiModelProperty(value="是否有免邮特权")
    private Integer priviledgeFreeFreight;

    /**
    * 是否有签到特权
    */
    @ApiModelProperty(value="是否有签到特权")
    private Integer priviledgeSignIn;

    /**
    * 是否有评论获奖励特权
    */
    @ApiModelProperty(value="是否有评论获奖励特权")
    private Integer priviledgeComment;

    /**
    * 是否有专享活动特权
    */
    @ApiModelProperty(value="是否有专享活动特权")
    private Integer priviledgePromotion;

    /**
    * 是否有会员价格特权
    */
    @ApiModelProperty(value="是否有会员价格特权")
    private Integer priviledgeMemberPrice;

    /**
    * 是否有生日特权
    */
    @ApiModelProperty(value="是否有生日特权")
    private Integer priviledgeBirthday;

    @ApiModelProperty(value="注释")
    private String note;
}