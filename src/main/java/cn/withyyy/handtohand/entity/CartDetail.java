package cn.withyyy.handtohand.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
/**
 * 购物车详情
 */
public class CartDetail {

  @TableId
  //商品id
    private String goodId;
    //商品名称
  private String goodName;
    //商品数量
    private Integer num;
    //商品单价
    private Double singlePrice;
    //购物车id
    private String cartId;
    //商品图片路径
    private String img;
}
