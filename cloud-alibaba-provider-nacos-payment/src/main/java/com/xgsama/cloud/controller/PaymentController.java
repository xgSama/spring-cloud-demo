package com.xgsama.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * PaymentController
 *
 * @author : xgSama
 * @date : 2021/8/25 21:17:09
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "nacos register, serverPort" + serverPort + "\t ID: " + id + "O(∩_∩)O哈哈~";
    }

}
