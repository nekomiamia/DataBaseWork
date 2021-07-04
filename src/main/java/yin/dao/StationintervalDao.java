package yin.dao;

import yin.entity.Stationinterval;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Stationinterval)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-04 21:14:18
 */
public interface StationintervalDao {

    /**
     * 通过ID查询单条数据
     *
     * @param trainId 主键
     * @return 实例对象
     */
    Stationinterval queryById(Integer trainId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Stationinterval> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param stationinterval 实例对象
     * @return 对象列表
     */
    List<Stationinterval> queryAll(Stationinterval stationinterval);

    /**
     * 新增数据
     *
     * @param stationinterval 实例对象
     * @return 影响行数
     */
    int insert(Stationinterval stationinterval);

    /**
     * 修改数据
     *
     * @param stationinterval 实例对象
     * @return 影响行数
     */
    int update(Stationinterval stationinterval);

    /**
     * 通过主键删除数据
     *
     * @param trainId 主键
     * @return 影响行数
     */
    int deleteById(Integer trainId);

}