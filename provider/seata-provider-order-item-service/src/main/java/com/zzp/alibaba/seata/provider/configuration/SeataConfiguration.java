package com.zzp.alibaba.seata.provider.configuration;

import com.zaxxer.hikari.HikariDataSource;
import io.seata.rm.datasource.DataSourceProxy;
import io.seata.spring.annotation.GlobalTransactionScanner;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.transaction.SpringManagedTransactionFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import javax.sql.DataSource;

/**
 * @author 佐斯特勒
 * <p>
 *  Seata配置类
 * </p>
 * @version v1.0.0
 * @date 2020/2/4 19:50
 * @see  SeataConfiguration
 **/
@Configuration
public class SeataConfiguration {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource hikariDataSource(){
        return new HikariDataSource();
    }

    /**
     * Seata需要通知DataSource，这里是代理DataSource
     * @param dataSource .
     * @return .
     */
    @Primary
    @Bean("dataSource")
    public DataSourceProxy dataSource(DataSource dataSource){
        return new DataSourceProxy(dataSource);
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSourceProxy dataSourceProxy) throws Exception {
        var sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSourceProxy);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath*:/mapper/*.xml"));
        sqlSessionFactoryBean.setTransactionFactory(new SpringManagedTransactionFactory());
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public GlobalTransactionScanner globalTransactionScanner() {
        return new GlobalTransactionScanner("seata-provider-order-item", "tx_group");
    }
}
