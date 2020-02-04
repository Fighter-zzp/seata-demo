package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/**
 * @author 佐斯特勒
 * <p>
 *  统一mapper接口
 * </p>
 * @version v1.0.0
 * @date 2020/2/4 0:26
 * @see  MyMapper
 **/
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
