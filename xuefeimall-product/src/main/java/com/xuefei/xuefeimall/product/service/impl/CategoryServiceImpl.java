package com.xuefei.xuefeimall.product.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuefei.common.utils.PageUtils;
import com.xuefei.common.utils.Query;

import com.xuefei.xuefeimall.product.dao.CategoryDao;
import com.xuefei.xuefeimall.product.entity.CategoryEntity;
import com.xuefei.xuefeimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    private static final Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 1、查出所有分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
//        logger.info("categoryEntities的值为{}", JSON.toJSON(categoryEntities));
        List<CategoryEntity> categoryEntityList = categoryEntities.stream().filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map((categoryEntity) -> {
                    categoryEntity.setCategoryEntityList(getChildrens(categoryEntity, categoryEntities));
                    return categoryEntity;
                }).sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                })
                .collect(Collectors.toList());
        return categoryEntityList;
    }

    /**
     * 递归查找所有查单的子菜单
     *
     * @param category
     * @param categoryEntities
     * @return
     */
    private List<CategoryEntity> getChildrens(CategoryEntity category, List<CategoryEntity> categoryEntities) {
        List<CategoryEntity> children = categoryEntities.stream().filter(categoryEntity -> categoryEntity.getParentCid() == category.getCatId()).map(categoryEntity -> {
            categoryEntity.setCategoryEntityList(getChildrens(categoryEntity, categoryEntities));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
//        logger.info("子菜单为{}",JSON.toJSON(categoryEntities));
        return children;
    }

}