package yin.controller;

import yin.entity.Contactor;
import yin.service.ContactorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Contactor)表控制层
 *
 * @author makejava
 * @since 2021-07-04 21:27:53
 */
@RestController
@RequestMapping("contactor")
public class ContactorController {
    /**
     * 服务对象
     */
    @Resource
    private ContactorService contactorService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */


}