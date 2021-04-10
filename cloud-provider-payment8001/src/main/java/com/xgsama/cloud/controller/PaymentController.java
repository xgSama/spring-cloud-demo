package com.xgsama.cloud.controller;

import com.xgsama.cloud.entity.CommonResult;
import com.xgsama.cloud.entity.Payment;
import com.xgsama.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * PaymentController
 *
 * @author xgSama
 * @date 2021/4/10 22:36
 */
@Slf4j
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("**********插入数据" + payment + "\n结果：" + result);

        if (result > 0) {
            return new CommonResult<>(200, "插入数据库成功", result);
        } else {

            return new CommonResult<>(444, "插入数据库失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);

        log.info("查询结果" + result);

        if (result != null) {
            return new CommonResult<>(200, "查询数据库成功", result);
        } else {

            return new CommonResult<>(444, "没有对应的记录", null);
        }
    }
}
