package com.xgsama.cloud.service;

import org.springframework.stereotype.Component;

/**
 * PaymentFallbackService
 *
 * @author : xgSama
 * @date : 2021/8/24 22:50:27
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "--------- PaymentFallbackService fallback ***** paymentInfo_OK *****";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "--------- PaymentFallbackService fallback ***** paymentInfo_Timeout *****";
    }
}
