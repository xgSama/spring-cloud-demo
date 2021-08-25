package com.xgsama.cloud.controller;

import com.xgsama.cloud.entity.CommonResult;
import com.xgsama.cloud.entity.Payment;
import com.xgsama.cloud.enums.ServiceEnum;
import com.xgsama.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("**********插入数据" + payment + "\n结果：" + result);

        if (result > 0) {
            return new CommonResult<>(200, "插入数据库成功" + serverPort, result);
        } else {

            return new CommonResult<>(444, "插入数据库失败" + serverPort, null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);

        log.info("查询结果" + result);

        if (result != null) {
            return new CommonResult<>(200, "查询数据库成功" + serverPort, result);
        } else {

            return new CommonResult<>(444, "没有对应的记录" + serverPort, null);
        }
    }

    @GetMapping("/payment/discovery")
    public Object discover() {
        List<String> services = discoveryClient.getServices();

        for (String service : services) {
            log.info("------------ element: " + service);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances(ServiceEnum.CLOUD_PAYMENT_SERVICE.service());

        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" +
                    instance.getPort() + "\t" + instance.getUri());
        }

        return this.discoveryClient;
    }


    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return serverPort;
    }

    @GetMapping("/payment/lb")
    public String lb() {
        return serverPort;
    }
}
