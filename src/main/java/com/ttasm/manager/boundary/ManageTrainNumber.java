package com.ttasm.manager.boundary;

import com.ttasm.manager.dao.Train_NumberMapper;
import com.ttasm.manager.pojo.Train;
import com.ttasm.manager.pojo.Train_Number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ManageTrainNumber")
@CrossOrigin("http://localhost:63342")
public class ManageTrainNumber {
    @Autowired(required=true)
    private Train_NumberMapper trainNumberMapper;

    @RequestMapping("addTrainNumber")
    public void addTrainNumber(Train_Number train_number) {
        trainNumberMapper.insert(train_number);
    }

    @RequestMapping("selectAll")
    public List<Train_Number> selectAll(){
        return trainNumberMapper.selectAll();
    }

    @RequestMapping("deleteByPrimaryKey")
    public void deleteByPrimaryKey(String trainNumber) {
        trainNumberMapper.deleteByPrimaryKey(trainNumber);
    }

    @RequestMapping("updateByPrimaryKey")
    public void updateByPrimaryKey(Train_Number row) {
        trainNumberMapper.updateByPrimaryKey(row);
    }
}
