package com.xuefei.xuefeimall.order.dao;

import com.xuefei.xuefeimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xuefei
 * @email 740067241@qq.com
 * @date 2021-01-26 18:22:21
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
