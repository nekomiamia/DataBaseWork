package yin.controller;

import yin.entity.Stationinterval;
import yin.service.StationintervalService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Stationinterval)表控制层
 *
 * @author makejava
 * @since 2021-07-04 21:27:56
 */
@RestController
@RequestMapping("stationinterval")
public class StationintervalController {
    /**
     * 服务对象
     */
    @Resource
    private StationintervalService stationintervalService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */

}