package cn.withyyy.handtohand.entity;

import lombok.Data;

import java.util.Date;

@Data
/**
 * 订单
 */
public class OrderMain {
    //订单id
    private String id;
    //购买者姓名
    private String buyerName;
    //购买者电话
    private Long buyerPhone;
    //购买者住址
    private String buyerAddr;
    //订单创建时间
    private Date createTime;
    //订单修改时间
    private Date updateTime;
    //订单总价格
    private Double totalPrice;
    //支付状态
    private Boolean payStatus;
    //订单状态
    private Boolean orderStatus;
    //购买者id
    private String buyerId;
}
