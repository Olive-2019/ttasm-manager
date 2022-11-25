package com.ttasm.manager.boundary;

import com.ttasm.manager.dao.TrainMapper;
import com.ttasm.manager.dao.Train_NumberMapper;
import com.ttasm.manager.dao.TricketMapper;
import com.ttasm.manager.pojo.Train;
import com.ttasm.manager.pojo.Train_Number;
import com.ttasm.manager.pojo.Tricket;
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

    @Autowired(required=true)
    private TrainMapper trainMapper;

    @Autowired(required=true)
    private TricketMapper tricketMapper;

    @RequestMapping("addTrainNumber")
    public void addTrainNumber(Train_Number train_number) {
        trainNumberMapper.insert(train_number);
        String trainID = train_number.getTrainId();
        Train train = trainMapper.selectByPrimaryKey(trainID);
        if (train == null) return;
        for (Integer i = 0; i < train.getCapacity(); ++i) {
            insertTicket(train_number.getTrainNumber(), i.toString());
        }
    }

    @RequestMapping("selectAll")
    public List<Train_Number> selectAll(){
        return trainNumberMapper.selectAll();
    }

    @RequestMapping("deleteByPrimaryKey")
    public void deleteByPrimaryKey(String trainNumber) {
        Train_Number train_number = trainNumberMapper.selectByPrimaryKey(trainNumber);
        Train train = trainMapper.selectByPrimaryKey(train_number.getTrainId());
        ManageTicket manageTicket = new ManageTicket();
        for (Integer i = 0; i < train.getCapacity(); ++i) {
            String ticketID = trainNumber + '-' + i.toString();
            manageTicket.deleteTicket(ticketID);
        }
        trainNumberMapper.deleteByPrimaryKey(trainNumber);
    }

    @RequestMapping("updateByPrimaryKey")
    public void updateByPrimaryKey(Train_Number row) {
        trainNumberMapper.updateByPrimaryKey(row);
    }

    public void insertTicket(String trainNumber, String seat) {
        Tricket tricket = new Tricket();
        tricket.setTrainNumber(trainNumber);
        tricket.setSeat(seat);
        tricket.setTicketId(tricket.getTrainNumber() + '-' + tricket.getSeat());
        tricketMapper.insert(tricket);
    }
}
