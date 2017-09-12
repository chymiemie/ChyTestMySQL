package com.chy.yihe.dao;

import java.util.List;

import com.chy.yihe.model.Studentinfo;

public interface StudentinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Studentinfo record);

    int insertSelective(Studentinfo record);

    Studentinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Studentinfo record);

    int updateByPrimaryKey(Studentinfo record);
    
    List<Studentinfo> selectStuAndCouese(String name);
}