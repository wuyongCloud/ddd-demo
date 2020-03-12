package com.example.ddddemo.interFaces.tracking;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wy
 * @ProjectName 公牛智能家居云服务平台
 * @Description 物流查询
 * @date 2020/3/12 10:29
 */
@RestController("/track")
public class CargoTrackingController {


    /**
     * 查询货物信息
     */
    @PostMapping
    public String onSumbut(@RequestBody TrackingQuery trackingQuery){

        return "";
    }



}
