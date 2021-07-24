package cn.withyyy.handtohand.service.impl;

import cn.withyyy.handtohand.dao.OrderDetailMapper;
import cn.withyyy.handtohand.entity.OrderDetail;
import cn.withyyy.handtohand.service.OrderDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
