package com.ttasm.manager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("TrainManagementController")
public class TrainManagementController {
    @RequestMapping("new_train")
    public String new_train(String train_infos){
        return "";
    }
    @RequestMapping("delete_train")
    public String delete_train(String train_ID){
        return "";
    }

}
