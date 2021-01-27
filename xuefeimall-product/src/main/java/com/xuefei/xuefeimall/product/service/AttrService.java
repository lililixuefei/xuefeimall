package com.xuefei.xuefeimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuefei.common.utils.PageUtils;
import com.xuefei.xuefeimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author xuefei
 * @email 740067241@qq.com
 * @date 2021-01-26 15:14:39
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

