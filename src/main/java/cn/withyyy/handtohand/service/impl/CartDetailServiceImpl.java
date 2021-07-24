package cn.withyyy.handtohand.service.impl;

import cn.withyyy.handtohand.dao.CartDetailMapper;
import cn.withyyy.handtohand.entity.CartDetail;
import cn.withyyy.handtohand.service.CartDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CartDetailServiceImpl extends ServiceImpl<CartDetailMapper, CartDetail> implements CartDetailService {
}
