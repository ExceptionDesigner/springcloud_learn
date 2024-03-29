package com.bobby;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = {"com.bobby.mapper"})
public class NacosUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosUserServiceApplication.class, args);
    }

}
