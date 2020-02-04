package com.zzp.alibaba.seata.provider.service.impl;

import com.zzp.alibaba.seata.provider.api.TbOrderService;
import com.zzp.alibaba.seata.provider.domain.TbOrder;
import com.zzp.alibaba.seata.provider.mapper.TbOrderMapper;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * @author 佐斯特勒
 * <p>
 *  订单服务实现
 * </p>
 * @version v1.0.0
 * @date 2020/2/4 20:22
 * @see  TbOrderServiceImpl
 **/
@Service(version = "1.0.0")
@Slf4j
public class TbOrderServiceImpl implements TbOrderService {
    @Resource
    private TbOrderMapper tbOrderMapper;

    @Override
    public void save(TbOrder tbOrder) {
        log.info(" 全局事务 id ：" + RootContext.getXID());
        if (tbOrderMapper.insert(tbOrder)>0){
            log.info("订单保存成功");
        }
    }
}
