package com.ttasm.manager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

@RestController
@RequestMapping("TrainNumberManagementController")
public class TrainNumberManagementController {

    @RequestMapping("new_train_number")
    public String new_train_number(String train_ID, String departure_station,
                                   String destination_station, Date departure_time,
                                   Date estimated_arrival_time, double price){
        return "";
    }
    @RequestMapping("delete_train_number")
    public String delete_train_number(String train_number_ID){
        return "";
    }
    @RequestMapping("get_all_available_trains")
    public String get_all_available_trains(){
        //添加车次信息时，需要选择一个列车，此处用于查询所有可用列车
        return "";
    }
}
