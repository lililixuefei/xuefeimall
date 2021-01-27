package com.xuefei.xuefeimall.product.dao;

import com.xuefei.xuefeimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author xuefei
 * @email 740067241@qq.com
 * @date 2021-01-26 15:14:38
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
