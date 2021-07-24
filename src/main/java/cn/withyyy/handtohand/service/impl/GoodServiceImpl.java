package cn.withyyy.handtohand.service.impl;

import cn.withyyy.handtohand.dao.GoodMapper;
import cn.withyyy.handtohand.entity.Good;
import cn.withyyy.handtohand.service.GoodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class GoodServiceImpl extends ServiceImpl<GoodMapper, Good> implements GoodService {
}
