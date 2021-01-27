package com.xuefei.xuefeimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuefei.common.utils.PageUtils;
import com.xuefei.xuefeimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author xuefei
 * @email 740067241@qq.com
 * @date 2021-01-26 18:29:32
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

