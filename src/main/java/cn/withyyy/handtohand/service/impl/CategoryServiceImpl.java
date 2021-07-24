package cn.withyyy.handtohand.service.impl;

import cn.withyyy.handtohand.dao.CategoryMapper;
import cn.withyyy.handtohand.entity.Category;
import cn.withyyy.handtohand.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
}
