package com.xuefei.xuefeimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuefei.common.utils.PageUtils;
import com.xuefei.xuefeimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author xuefei
 * @email 740067241@qq.com
 * @date 2021-01-26 19:12:45
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

