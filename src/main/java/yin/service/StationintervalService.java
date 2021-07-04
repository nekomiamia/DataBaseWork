package yin.service;

import yin.entity.Stationinterval;
import java.util.List;

/**
 * (Stationinterval)表服务接口
 *
 * @author makejava
 * @since 2021-07-04 21:14:18
 */
public interface StationintervalService {

    /**
     * 通过ID查询单条数据
     *
     * @param trainId 主键
     * @return 实例对象
     */
    Stationinterval queryById(Integer trainId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Stationinterval> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param stationinterval 实例对象
     * @return 实例对象
     */
    Stationinterval insert(Stationinterval stationinterval);

    /**
     * 修改数据
     *
     * @param stationinterval 实例对象
     * @return 实例对象
     */
    Stationinterval update(Stationinterval stationinterval);

    /**
     * 通过主键删除数据
     *
     * @param trainId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer trainId);

}