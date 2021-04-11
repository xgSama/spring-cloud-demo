package com.xgsama.cloud.enums;

/**
 * ServiceEnum
 *
 * @author xgSama
 * @date 2021/4/11 14:35
 */
public enum ServiceEnum {

    CLOUD_PAYMENT_SERVICE("CLOUD-PAYMENT-SERVICE","sss"),
    CLOUD_ORDER_SERVICE("CLOUD-ORDER-SERVICE","");

    private String service;
    private String desc;

    ServiceEnum(String service, String desc){
        this.service = service;
        this.desc = desc;
    }
    public String service() {
        return  service;
    }


    public String getDesc() {
        return desc;
    }
}
