package cn.withyyy.handtohand.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
/**
 * 订单详情
 */
public class OrderDetail {

    @TableId
    //商品id
    private String goodId;
    //订单id
    private String orderId;
    //商品名称
    private String goodName;
    //商品单价
    private Double singlePrice;
    //商品图片路径
    private String img;
    //商品数量
    private Integer num;
}
