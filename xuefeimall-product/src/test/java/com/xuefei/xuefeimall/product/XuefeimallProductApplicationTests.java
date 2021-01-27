package com.xuefei.xuefeimall.product;

import com.xuefei.xuefeimall.product.entity.BrandEntity;
import com.xuefei.xuefeimall.product.service.BrandService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XuefeimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("huawei");
//        boolean save = brandService.save(brandEntity);
        BrandEntity byId = brandService.getById("1");
        System.out.println(byId.toString());
//        if(save){
//            System.out.println("保存成功");
//        }
    }

}
