package com.xuefei.xuefeimall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class XuefeimallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(XuefeimallOrderApplication.class, args);
    }

}
