package com.xgsama.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * OrderFeignMain
 *
 * @author : xgSama
 * @date : 2021/8/22 21:06:03
 */
@EnableFeignClients
@SpringBootApplication
public class OrderFeignMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain.class, args);
    }
}
