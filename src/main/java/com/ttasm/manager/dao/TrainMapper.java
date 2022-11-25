package com.ttasm.manager.dao;

import com.ttasm.manager.pojo.Train;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TrainMapper {

    @Delete("DELETE FROM train WHERE (train_ID = #{trainId})")
    int deleteByPrimaryKey(String trainId);


    @Insert("insert into train values(#{trainId}, #{capacity})")
    int insert(Train row);


    @Select("select * from train where train_id = #{trainId}")
    Train selectByPrimaryKey(String trainId);

    @Select("select * from train")
    List<Train> selectAll();


    @Update("UPDATE train SET capacity = #{capacity} WHERE (train_ID = #{trainId});")
    int updateByPrimaryKey(Train row);
}