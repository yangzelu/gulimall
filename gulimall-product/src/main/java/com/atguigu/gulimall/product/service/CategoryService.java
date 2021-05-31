package com.atguigu.gulimall.product.service;

import com.atguigu.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author yangzelu
 * @email 1191177195@qq.com
 * @date 2021-05-30 15:17:56
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

