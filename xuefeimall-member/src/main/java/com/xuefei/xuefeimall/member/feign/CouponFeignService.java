package com.xuefei.xuefeimall.member.feign;

import com.xuefei.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: openFeign 远程调用接口
 * @author: xuefei
 * @date: 2021/01/26 19:19
 */
@FeignClient("xuefeimall-coupon")
public interface CouponFeignService {

    @RequestMapping("coupon/coupon/member/list")
    public R memberCoupons();

}
