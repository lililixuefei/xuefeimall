package com.xuefei.xuefeimall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class XuefeimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(XuefeimallProductApplication.class, args);
    }

}
