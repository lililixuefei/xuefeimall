package com.xuefei.xuefeimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.xuefei.xuefeimall.member.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class XuefeimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(XuefeimallMemberApplication.class, args);
    }

}
