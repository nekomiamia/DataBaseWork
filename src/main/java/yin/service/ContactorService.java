package yin.service;

import yin.entity.Contactor;
import java.util.List;

/**
 * (Contactor)表服务接口
 *
 * @author makejava
 * @since 2021-07-04 21:27:53
 */
public interface ContactorService {

    /**
     * 通过ID查询单条数据
     *
     * @param accountId 主键
     * @return 实例对象
     */
    Contactor queryById(Integer accountId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Contactor> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param contactor 实例对象
     * @return 实例对象
     */
    Contactor insert(Contactor contactor);

    /**
     * 修改数据
     *
     * @param contactor 实例对象
     * @return 实例对象
     */
    Contactor update(Contactor contactor);

    /**
     * 通过主键删除数据
     *
     * @param accountId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer accountId);

}