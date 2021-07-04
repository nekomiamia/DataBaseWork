package yin.service;

import yin.entity.Station;
import java.util.List;

/**
 * (Station)表服务接口
 *
 * @author makejava
 * @since 2021-07-04 21:14:18
 */
public interface StationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Station queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Station> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param station 实例对象
     * @return 实例对象
     */
    Station insert(Station station);

    /**
     * 修改数据
     *
     * @param station 实例对象
     * @return 实例对象
     */
    Station update(Station station);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}