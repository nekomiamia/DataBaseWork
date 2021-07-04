package yin.controller;

import yin.entity.Station;
import yin.service.StationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Station)表控制层
 *
 * @author makejava
 * @since 2021-07-04 21:14:18
 */
@RestController
@RequestMapping("station")
public class StationController {
    /**
     * 服务对象
     */
    @Resource
    private StationService stationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Station selectOne(Integer id) {
        return this.stationService.queryById(id);
    }

}