package com.ttasm.manager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("TicketBookingController")
public class TicketBookingController {

    @RequestMapping("get_all_departure_station")
    public String get_all_departure_station(){
        return "";
    }

    @RequestMapping("get_all_destination_station")
    public String get_all_destination_station(){
        return "";
    }

    @RequestMapping("get_all_train_number_info")
    public String get_all_train_number_info(String departure_station, String destination_station){
        //进入页面时需要先展示所有列车信息
        return "";
    }

    @RequestMapping("get_train_number_info_detail")
    public String get_train_number_info_detail(){
        return "";
    }
    @RequestMapping("lock_seat")
    public String lock_seat(String train_number_ID, String seat_ID){
        //选定座位后的检查以及订单信息的创建加载
        return "";
    }
    @RequestMapping("pay")
    public String pay(String order_ID,int payment_amount){
        //付款后订单状态的转变、找零等
        return "";
    }


}
