package com.zzp.alibaba.seata.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author ZZP
 */
@EnableDiscoveryClient
@EnableTransactionManagement
@SpringBootApplication
@MapperScan(basePackages = "com.zzp.alibaba.seata.provider.mapper")
public class SeataProviderOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeataProviderOrderApplication.class, args);
    }
}
