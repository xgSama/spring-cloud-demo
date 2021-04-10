package com.xgsama.cloud.service.impl;

import com.xgsama.cloud.dao.PaymentDao;
import com.xgsama.cloud.entity.Payment;
import com.xgsama.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * PaymentServiceImpl
 *
 * @author xgSama
 * @date 2021/4/10 22:34
 */
@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
