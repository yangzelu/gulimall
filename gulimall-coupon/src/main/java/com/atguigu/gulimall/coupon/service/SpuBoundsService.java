package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author yangzelu
 * @email 1191177195@qq.com
 * @date 2021-05-30 18:25:46
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

