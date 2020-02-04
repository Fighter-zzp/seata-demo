package com.zzp.alibaba.seata.provider.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
/**
 * @author 佐斯特勒
 * <p>
 *  订单类
 * </p>
 * @version v1.0.0
 * @date 2020/2/4 19:10
 * @see  TbOrder
 **/
@Data
@Table(name = "tb_order")
public class TbOrder implements Serializable {
    private static final long serialVersionUID = -7890772162952304061L;
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "user_id")
    private Long userId;
}
