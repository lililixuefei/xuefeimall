package com.xuefei.xuefeimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuefei.common.utils.PageUtils;
import com.xuefei.xuefeimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author xuefei
 * @email 740067241@qq.com
 * @date 2021-01-26 15:14:38
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

