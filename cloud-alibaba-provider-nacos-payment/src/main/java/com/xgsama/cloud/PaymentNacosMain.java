package com.xgsama.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * PaymentNacosMain
 *
 * @author : xgSama
 * @date : 2021/8/25 21:06:06
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentNacosMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentNacosMain.class, args);
    }
}
