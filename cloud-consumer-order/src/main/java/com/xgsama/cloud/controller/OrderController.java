package com.xgsama.cloud.controller;

import com.xgsama.cloud.entity.CommonResult;
import com.xgsama.cloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static com.xgsama.cloud.config.CommonConstant.*;

import javax.annotation.Resource;

/**
 * OrderController
 *
 * @author xgSama
 * @date 2021/4/10 23:05
 */
@SuppressWarnings("unchecked")
@Slf4j
@RestController
public class OrderController {

    public static final String PAYMENT_URL = HTTP + CLOUD_PAYMENT_SERVICE;

    @Resource
    RestTemplate restTemplate;


    @GetMapping("/consumer/payment/create")
    public CommonResult<Integer> create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get2/{id}")
    public CommonResult<Payment> get2(@PathVariable("id") Long id) {

        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);


        if (entity.getStatusCode().is2xxSuccessful()) {
            return entity.getBody();
        } else {
            return new CommonResult<>(444, "操作失败");
        }
    }
}
