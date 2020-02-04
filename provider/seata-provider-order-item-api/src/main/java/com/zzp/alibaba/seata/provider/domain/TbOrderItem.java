package com.zzp.alibaba.seata.provider.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
/**
 * @author 佐斯特勒
 * <p>
 *  order_item类
 * </p>
 * @version v1.0.0
 * @date 2020/2/4 19:29
 * @see  TbOrderItem
 **/
@Data
@Table(name = "tb_order_item")
public class TbOrderItem implements Serializable {
    private static final long serialVersionUID = -2920248646132568883L;
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "order_item_id")
    private Long orderItemId;

}
