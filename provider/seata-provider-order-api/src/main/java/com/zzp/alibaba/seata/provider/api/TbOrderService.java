package com.zzp.alibaba.seata.provider.api;

import com.zzp.alibaba.seata.provider.domain.TbOrder;

/**
 * @author 佐斯特勒
 * <p>
 *  订单服务接口
 * </p>
 * @version v1.0.0
 * @date 2020/2/4 19:09
 * @see  TbOrderService
 **/
public interface TbOrderService{

    /**
     * 保存订单
     * @param tbOrder .
     */
    void save(TbOrder tbOrder);

}
