package cn.withyyy.handtohand.entity;

import lombok.Data;

@Data
/**
 * 购物车
 */
public class Cart {
    //购物车id
    private String id;
    //车内总价
    private Double totalPrice;
    //购买者id
    private String buyerId;
}
