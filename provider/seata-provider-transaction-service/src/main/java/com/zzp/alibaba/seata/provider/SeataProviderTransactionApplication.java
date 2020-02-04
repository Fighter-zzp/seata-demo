package com.zzp.alibaba.seata.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ZZP
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SeataProviderTransactionApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeataProviderTransactionApplication.class, args);
    }
}
