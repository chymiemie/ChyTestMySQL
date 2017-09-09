package com.chy.yihe.dao;

import com.chy.yihe.model.TSchool;

public interface TSchoolMapper {
    int insert(TSchool record);

    int insertSelective(TSchool record);
}