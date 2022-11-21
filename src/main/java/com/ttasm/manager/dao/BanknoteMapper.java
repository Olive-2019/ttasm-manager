package com.ttasm.manager.dao;

import com.ttasm.manager.pojo.Banknote;

import java.util.List;

public interface BanknoteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banknote
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer amount);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banknote
     *
     * @mbg.generated
     */
    int insert(Banknote row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banknote
     *
     * @mbg.generated
     */
    Banknote selectByPrimaryKey(Integer amount);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banknote
     *
     * @mbg.generated
     */
    List<Banknote> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banknote
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Banknote row);
}