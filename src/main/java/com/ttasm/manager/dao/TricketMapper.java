package com.ttasm.manager.dao;

import com.ttasm.manager.pojo.Tricket;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper

public interface TricketMapper {

    @Delete("DELETE FROM tricket WHERE (ticket_ID = #{ticketId})")
    int deleteByPrimaryKey(String ticketId);

    @Insert("INSERT INTO tricket (ticket_ID, train_number, seat) VALUES (#{ticket_id},  #{train_number}, #{seat});")
    int insert(Tricket row);

    Tricket selectByPrimaryKey(String ticketId);

    List<Tricket> selectAll();

    int updateByPrimaryKey(Tricket row);
}