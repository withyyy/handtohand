package cn.withyyy.handtohand.service.impl;

import cn.withyyy.handtohand.dao.CartMapper;
import cn.withyyy.handtohand.entity.Cart;
import cn.withyyy.handtohand.service.CartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements CartService {
}
