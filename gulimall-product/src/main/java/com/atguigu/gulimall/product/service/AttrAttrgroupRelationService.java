package com.atguigu.gulimall.product.service;

import com.atguigu.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author yangzelu
 * @email 1191177195@qq.com
 * @date 2021-05-30 15:17:56
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

