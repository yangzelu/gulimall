package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author yangzelu
 * @email 1191177195@qq.com
 * @date 2021-05-30 22:02:11
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
