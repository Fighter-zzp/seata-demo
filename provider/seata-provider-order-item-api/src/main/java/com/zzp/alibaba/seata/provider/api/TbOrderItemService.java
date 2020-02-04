package com.zzp.alibaba.seata.provider.api;

import com.zzp.alibaba.seata.provider.domain.TbOrderItem;

/**
 * @author 佐斯特勒
 * <p>
 *  订单列表服务接口
 * </p>
 * @version v1.0.0
 * @date 2020/2/4 19:45
 * @see  TbOrderItemService
 **/
public interface TbOrderItemService {

    /**
     * 保存订单条
     * @param tbOrderItem
     */
    void save(TbOrderItem tbOrderItem);

}
