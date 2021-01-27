package com.xuefei.xuefeimall.coupon.dao;

import com.xuefei.xuefeimall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author xuefei
 * @email 740067241@qq.com
 * @date 2021-01-26 19:12:45
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
