package yin.controller;

import yin.entity.Train;
import yin.service.TrainService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Train)表控制层
 *
 * @author makejava
 * @since 2021-07-04 21:27:56
 */
@RestController
@RequestMapping("train")
public class TrainController {
    /**
     * 服务对象
     */
    @Resource
    private TrainService trainService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */

}