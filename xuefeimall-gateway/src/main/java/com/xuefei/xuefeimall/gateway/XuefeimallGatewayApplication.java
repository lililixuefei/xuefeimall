package com.xuefei.xuefeimall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class XuefeimallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(XuefeimallGatewayApplication.class, args);
    }

}
