package yin.service.impl;

import yin.entity.Station;
import yin.dao.StationDao;
import yin.service.StationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Station)表服务实现类
 *
 * @author makejava
 * @since 2021-07-04 21:14:18
 */
@Service("stationService")
public class StationServiceImpl implements StationService {
    @Resource
    private StationDao stationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Station queryById(Integer id) {
        return this.stationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Station> queryAllByLimit(int offset, int limit) {
        return this.stationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param station 实例对象
     * @return 实例对象
     */
    @Override
    public Station insert(Station station) {
        this.stationDao.insert(station);
        return station;
    }

    /**
     * 修改数据
     *
     * @param station 实例对象
     * @return 实例对象
     */
    @Override
    public Station update(Station station) {
        this.stationDao.update(station);
        return this.queryById(station.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.stationDao.deleteById(id) > 0;
    }
}