package com.xuefei.xuefeimall.member.dao;

import com.xuefei.xuefeimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author xuefei
 * @email 740067241@qq.com
 * @date 2021-01-26 18:12:57
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
