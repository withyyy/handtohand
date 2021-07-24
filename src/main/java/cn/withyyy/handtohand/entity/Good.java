package cn.withyyy.handtohand.entity;

import lombok.Data;

@Data
public class Good {
    //商品id
    private String id;
    //商品名称
    private String name;
    //商品单价
    private Double price;
    //商品库存
    private Integer reserve;
    //类别id
    private String categoryId;
    //商品描述
    private String description;
    //商品图片路径
    private String img;
}
