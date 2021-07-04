package yin.service.impl;

import yin.entity.Stationinterval;
import yin.dao.StationintervalDao;
import yin.service.StationintervalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Stationinterval)表服务实现类
 *
 * @author makejava
 * @since 2021-07-04 21:27:56
 */
@Service("stationintervalService")
public class StationintervalServiceImpl implements StationintervalService {
    @Resource
    private StationintervalDao stationintervalDao;

    /**
     * 通过ID查询单条数据
     *
     * @param trainId 主键
     * @return 实例对象
     */
    @Override
    public Stationinterval queryById(Integer trainId) {
        return this.stationintervalDao.queryById(trainId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Stationinterval> queryAllByLimit(int offset, int limit) {
        return this.stationintervalDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param stationinterval 实例对象
     * @return 实例对象
     */
    @Override
    public Stationinterval insert(Stationinterval stationinterval) {
        this.stationintervalDao.insert(stationinterval);
        return stationinterval;
    }

    /**
     * 修改数据
     *
     * @param stationinterval 实例对象
     * @return 实例对象
     */
    @Override
    public Stationinterval update(Stationinterval stationinterval) {
        this.stationintervalDao.update(stationinterval);
        return this.queryById(stationinterval.getTrainId());
    }

    /**
     * 通过主键删除数据
     *
     * @param trainId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer trainId) {
        return this.stationintervalDao.deleteById(trainId) > 0;
    }
}