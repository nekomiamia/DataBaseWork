package yin.service.impl;

import yin.entity.Contactor;
import yin.dao.ContactorDao;
import yin.service.ContactorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Contactor)表服务实现类
 *
 * @author makejava
 * @since 2021-07-04 21:14:18
 */
@Service("contactorService")
public class ContactorServiceImpl implements ContactorService {
    @Resource
    private ContactorDao contactorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param accountId 主键
     * @return 实例对象
     */
    @Override
    public Contactor queryById(Integer accountId) {
        return this.contactorDao.queryById(accountId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Contactor> queryAllByLimit(int offset, int limit) {
        return this.contactorDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param contactor 实例对象
     * @return 实例对象
     */
    @Override
    public Contactor insert(Contactor contactor) {
        this.contactorDao.insert(contactor);
        return contactor;
    }

    /**
     * 修改数据
     *
     * @param contactor 实例对象
     * @return 实例对象
     */
    @Override
    public Contactor update(Contactor contactor) {
        this.contactorDao.update(contactor);
        return this.queryById(contactor.getAccountId());
    }

    /**
     * 通过主键删除数据
     *
     * @param accountId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer accountId) {
        return this.contactorDao.deleteById(accountId) > 0;
    }
}