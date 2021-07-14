package cn.withyyy.handtohand.service.impl;

import cn.withyyy.handtohand.dao.UserMapper;
import cn.withyyy.handtohand.entity.User;
import cn.withyyy.handtohand.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
