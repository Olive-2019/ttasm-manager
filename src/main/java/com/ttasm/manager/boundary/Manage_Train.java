package com.ttasm.manager.boundary;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Manage_Train")
public class Manage_Train {
    @RequestMapping("add_train")
    public void add_train() {
        System.out.println("add train");
    }
}
