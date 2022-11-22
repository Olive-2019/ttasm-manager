package com.ttasm.manager.boundary;

import com.ttasm.manager.dao.TrainMapper;
import com.ttasm.manager.pojo.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Manage_Train")
@CrossOrigin("http://localhost:63342")
public class Manage_Train {
    @Autowired(required=true)
    private TrainMapper trainMapper;

    @RequestMapping("add_train")
    public void add_train(Train train) {
        System.out.println("add train");
        trainMapper.insert(train);
    }

    @RequestMapping("selectAll")
    public List<Train> selectAll(){
        return trainMapper.selectAll();
    }

    @RequestMapping("deleteByPrimaryKey")
    public void deleteByPrimaryKey(String trainId) {
        trainMapper.deleteByPrimaryKey(trainId);
    }

    @RequestMapping("updateByPrimaryKey")
    public void updateByPrimaryKey(Train row) {
        trainMapper.updateByPrimaryKey(row);
    }
}
