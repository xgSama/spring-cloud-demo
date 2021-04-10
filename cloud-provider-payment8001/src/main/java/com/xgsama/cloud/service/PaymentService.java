package com.xgsama.cloud.service;

import com.xgsama.cloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * PaymentService
 *
 * @author xgSama
 * @date 2021/4/10 22:32
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);

}
