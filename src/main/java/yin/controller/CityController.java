package yin.controller;

import yin.entity.City;
import yin.service.CityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (City)表控制层
 *
 * @author makejava
 * @since 2021-07-04 21:14:18
 */
@RestController
@RequestMapping("city")
public class CityController {
    /**
     * 服务对象
     */
    @Resource
    private CityService cityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public City selectOne(Integer id) {
        return this.cityService.queryById(id);
    }

}