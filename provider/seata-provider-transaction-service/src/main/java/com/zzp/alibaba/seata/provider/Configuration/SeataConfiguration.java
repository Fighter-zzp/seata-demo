package com.zzp.alibaba.seata.provider.Configuration;

import io.seata.spring.annotation.GlobalTransactionScanner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 佐斯特勒
 * <p>
 *  全局事务扫描配置
 * </p>
 * @version v1.0.0
 * @date 2020/2/4 20:54
 * @see  SeataConfiguration
 **/
@Configuration
public class SeataConfiguration {
    @Bean
    public GlobalTransactionScanner globalTransactionScanner() {
        return new GlobalTransactionScanner("provider-transaction", "tx_group");
    }
}
