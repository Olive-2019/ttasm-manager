package com.ttasm.manager.boundary;

import com.ttasm.manager.dao.TricketMapper;
import com.ttasm.manager.pojo.Tricket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ManageTicket")
@CrossOrigin("http://localhost:63342")
public class ManageTicket {
    @Autowired(required=true)
    private TricketMapper tricketMapper;

    @RequestMapping("insertTicket")
    public void insertTicket(String trainNumber, String seat) {
        Tricket tricket = new Tricket();
        tricket.setTrainNumber(trainNumber);
        tricket.setSeat(seat);
        tricket.setTicketId(tricket.getTrainNumber() + '-' + tricket.getSeat());
        tricketMapper.insert(tricket);
    }

    public void deleteTicket(String ticketID) {
        tricketMapper.deleteByPrimaryKey(ticketID);
    }
}
