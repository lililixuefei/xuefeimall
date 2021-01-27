package com.xuefei.xuefeimall.order.dao;

import com.xuefei.xuefeimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author xuefei
 * @email 740067241@qq.com
 * @date 2021-01-26 18:22:21
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
