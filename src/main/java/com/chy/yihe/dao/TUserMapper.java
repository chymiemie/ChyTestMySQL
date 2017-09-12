package com.chy.yihe.dao;

import java.util.List;

import com.chy.yihe.model.TUser;
import com.chy.yihe.model.vo.UserAndTelNum;

public interface TUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
    
    List<UserAndTelNum> selectAllUserAndTelNum();
}