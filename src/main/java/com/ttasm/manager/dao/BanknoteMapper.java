package com.ttasm.manager.dao;

import com.ttasm.manager.pojo.Banknote;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper

public interface BanknoteMapper {

    int deleteByPrimaryKey(Integer amount);


    int insert(Banknote row);

    Banknote selectByPrimaryKey(Integer amount);


    List<Banknote> selectAll();


    int updateByPrimaryKey(Banknote row);
}