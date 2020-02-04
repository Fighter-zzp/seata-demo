package com.zzp.alibaba.seata.provider.api;

import com.zzp.alibaba.seata.provider.domain.TbOrder;
import com.zzp.alibaba.seata.provider.domain.TbOrderItem;

/**
 * @author 佐斯特勒
 * <p>
 *  提供者事务服务接口
 * </p>
 * @version v1.0.0
 * @date 2020/2/4 20:56
 * @see  ProviderTransactionService
 **/
public interface ProviderTransactionService {

    /**
     * 创建订单
     * @param order .
     * @param orderItem .
     */
    void createOrder(TbOrder order, TbOrderItem orderItem);

}
