package cn.withyyy.handtohand.service.impl;

import cn.withyyy.handtohand.dao.OrderMapper;
import cn.withyyy.handtohand.entity.OrderMain;
import cn.withyyy.handtohand.service.OrderMainService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrderMainServiceImpl extends ServiceImpl<OrderMapper, OrderMain> implements OrderMainService {
}
