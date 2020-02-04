package com.zzp.alibaba.seata.provider.service.impl;

import com.zzp.alibaba.seata.provider.api.ProviderTransactionService;
import com.zzp.alibaba.seata.provider.api.TbOrderItemService;
import com.zzp.alibaba.seata.provider.api.TbOrderService;
import com.zzp.alibaba.seata.provider.domain.TbOrder;
import com.zzp.alibaba.seata.provider.domain.TbOrderItem;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * @author 佐斯特勒
 * <p>
 *  事务服务实现
 * </p>
 * @version v1.0.0
 * @date 2020/2/4 20:59
 * @see  ProviderTransactionServiceImpl
 **/
@Service(version = "1.0.0")
public class ProviderTransactionServiceImpl implements ProviderTransactionService {

    private Logger log = LoggerFactory.getLogger(ProviderTransactionServiceImpl.class);

    @Reference(version = "1.0.0")
    private TbOrderService tbOrderService;

    @Reference(version = "1.0.0")
    private TbOrderItemService tbOrderItemService;

    /**
     * 创建订单 -- 全局事务
     * @param order .
     * @param orderItem .
     */
    @Override
    @GlobalTransactional
    public void createOrder(TbOrder order, TbOrderItem orderItem) {
        log.info(" 全局事务 id ：" + RootContext.getXID());
        tbOrderService.save(order);
        tbOrderItemService.save(orderItem);
        // 手动抛出异常用以测试全局事务
        if (order.getUserId().equals(2L)){
            throw new RuntimeException("Seata 异常.");
        }
    }
}
