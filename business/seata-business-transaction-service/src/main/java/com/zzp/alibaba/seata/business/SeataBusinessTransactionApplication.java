package com.zzp.alibaba.seata.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 佐斯特勒
 * <p>
 *  人皆知有用之用，而莫知无用之用也
 * </p>
 * @version v1.0.0
 * @date 2020/2/4 0:30
 * @see  SeataBusinessTransactionApplication
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class SeataBusinessTransactionApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeataBusinessTransactionApplication.class, args);
    }
}
