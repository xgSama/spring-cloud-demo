package com.xgsama.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MyselfRule
 *
 * @author xgSama
 * @date 2021/4/11 21:02
 */
@SuppressWarnings("SpringFacetCodeInspection")
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
