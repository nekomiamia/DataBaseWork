package yin.dao;

import yin.entity.Contactor;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Contactor)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-04 21:27:53
 */
public interface ContactorDao {

    /**
     * 通过ID查询单条数据
     *
     * @param accountId 主键
     * @return 实例对象
     */
    Contactor queryById(Integer accountId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Contactor> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param contactor 实例对象
     * @return 对象列表
     */
    List<Contactor> queryAll(Contactor contactor);

    /**
     * 新增数据
     *
     * @param contactor 实例对象
     * @return 影响行数
     */
    int insert(Contactor contactor);

    /**
     * 修改数据
     *
     * @param contactor 实例对象
     * @return 影响行数
     */
    int update(Contactor contactor);

    /**
     * 通过主键删除数据
     *
     * @param accountId 主键
     * @return 影响行数
     */
    int deleteById(Integer accountId);

}