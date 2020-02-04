package com.zzp.alibaba.seata.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author ZZP
 */
@SpringBootApplication
@MapperScan(basePackages = "com.zzp.alibaba.seata.provider.mapper")
@EnableDiscoveryClient
@EnableTransactionManagement
public class SeataProviderOrderItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeataProviderOrderItemApplication.class, args);
    }
}
