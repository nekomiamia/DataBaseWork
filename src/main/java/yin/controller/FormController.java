package yin.controller;

import yin.entity.Form;
import yin.service.FormService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Form)表控制层
 *
 * @author makejava
 * @since 2021-07-04 21:14:18
 */
@RestController
@RequestMapping("form")
public class FormController {
    /**
     * 服务对象
     */
    @Resource
    private FormService formService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Form selectOne( id) {
        return this.formService.queryById(id);
    }

}