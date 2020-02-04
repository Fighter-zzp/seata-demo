package com.zzp.alibaba.seata.business.controller;

import com.zzp.alibaba.seata.provider.api.ProviderTransactionService;
import com.zzp.alibaba.seata.provider.domain.TbOrder;
import com.zzp.alibaba.seata.provider.domain.TbOrderItem;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author 佐斯特勒
 * <p>
 *  事务业务接口
 * </p>
 * @version v1.0.0
 * @date 2020/2/4 21:05
 * @see  BusinessTransactionController
 **/
@RestController
@RequestMapping(value = "transaction")
public class BusinessTransactionController {

    @Reference(version = "1.0.0")
    private ProviderTransactionService transactionService;

    @GetMapping(value = "create/order/{id}")
    public String createOrder(@PathVariable String id) {
        var order = new TbOrder();
        order.setOrderId(1L);
        order.setUserId(Long.parseLong(id));
        var orderItem = new TbOrderItem();
        orderItem.setUserId(1L);
        orderItem.setOrderId(1L);
        orderItem.setOrderItemId(1L);
        // 调用全局业务发起者即可测试分布式事务效果
        transactionService.createOrder(order, orderItem);
        return "ok";
    }
}
