package com.xuefei.xuefeimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuefei.common.utils.PageUtils;
import com.xuefei.xuefeimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author xuefei
 * @email 740067241@qq.com
 * @date 2021-01-26 18:12:58
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

