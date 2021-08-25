package com.xgsama.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * OrderNacosMain
 *
 * @author : xgSama
 * @date : 2021/8/25 21:31:57
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain.class, args);
    }
}
