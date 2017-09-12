package com.chy.yihe.dao;

import java.util.List;

import com.chy.yihe.model.Courseinfo;

public interface CourseinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Courseinfo record);

    int insertSelective(Courseinfo record);

    Courseinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Courseinfo record);

    int updateByPrimaryKey(Courseinfo record);
    
    List<Courseinfo> selectCourseAndStu(String name);
}