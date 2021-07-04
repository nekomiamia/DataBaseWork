package yin.service.impl;

import yin.entity.Train;
import yin.dao.TrainDao;
import yin.service.TrainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Train)表服务实现类
 *
 * @author makejava
 * @since 2021-07-04 21:14:18
 */
@Service("trainService")
public class TrainServiceImpl implements TrainService {
    @Resource
    private TrainDao trainDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Train queryById(Integer id) {
        return this.trainDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Train> queryAllByLimit(int offset, int limit) {
        return this.trainDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param train 实例对象
     * @return 实例对象
     */
    @Override
    public Train insert(Train train) {
        this.trainDao.insert(train);
        return train;
    }

    /**
     * 修改数据
     *
     * @param train 实例对象
     * @return 实例对象
     */
    @Override
    public Train update(Train train) {
        this.trainDao.update(train);
        return this.queryById(train.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.trainDao.deleteById(id) > 0;
    }
}