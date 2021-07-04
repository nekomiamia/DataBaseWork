package yin.controller;

import yin.entity.City;
import yin.service.CityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (City)表控制层
 *
 * @author makejava
 * @since 2021-07-04 21:27:52
 */
@RestController
@RequestMapping("city")
public class CityController {
    /**
     * 服务对象
     */
    @Resource
    private CityService cityService;


}