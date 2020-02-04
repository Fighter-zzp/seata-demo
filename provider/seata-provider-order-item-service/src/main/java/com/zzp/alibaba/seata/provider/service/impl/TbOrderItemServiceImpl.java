package com.zzp.alibaba.seata.provider.service.impl;

import com.zzp.alibaba.seata.provider.api.TbOrderItemService;
import com.zzp.alibaba.seata.provider.domain.TbOrderItem;
import com.zzp.alibaba.seata.provider.mapper.TbOrderItemMapper;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * @author 佐斯特勒
 * <p>
 *  订单列表服务实现
 * </p>
 * @version v1.0.0
 * @date 2020/2/4 19:44
 * @see  TbOrderItemServiceImpl
 **/
@Service(version = "1.0.0")
@Slf4j
public class TbOrderItemServiceImpl implements TbOrderItemService {

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

    @Override
    public void save(TbOrderItem tbOrderItem) {
        log.info(" 全局事务 id ：" + RootContext.getXID());
        if (tbOrderItemMapper.insert(tbOrderItem)>0){
            log.info("插入成功");
        }
    }
}
