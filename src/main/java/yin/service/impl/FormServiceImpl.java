package yin.service.impl;

import yin.entity.Form;
import yin.dao.FormDao;
import yin.service.FormService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Form)表服务实现类
 *
 * @author makejava
 * @since 2021-07-04 21:27:54
 */
@Service("formService")
public class FormServiceImpl implements FormService {
    @Resource
    private FormDao formDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Form queryById(Integer id) {
        return this.formDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Form> queryAllByLimit(int offset, int limit) {
        return this.formDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param form 实例对象
     * @return 实例对象
     */
    @Override
    public Form insert(Form form) {
        this.formDao.insert(form);
        return form;
    }

    /**
     * 修改数据
     *
     * @param form 实例对象
     * @return 实例对象
     */
    @Override
    public Form update(Form form) {
        this.formDao.update(form);
        return this.queryById(form.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.formDao.deleteById(id) > 0;
    }
}