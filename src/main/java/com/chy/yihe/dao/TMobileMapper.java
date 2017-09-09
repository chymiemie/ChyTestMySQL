package com.chy.yihe.dao;

import java.util.List;

import com.chy.yihe.model.TMobile;

public interface TMobileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TMobile record);

    int insertSelective(TMobile record);

    TMobile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TMobile record);

    int updateByPrimaryKey(TMobile record);
    
    List<TMobile> selectAll(Integer id);
}