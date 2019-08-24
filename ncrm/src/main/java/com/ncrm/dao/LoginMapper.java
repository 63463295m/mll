package com.ncrm.dao;

import com.ncrm.entity.Login;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LoginMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Login record);

    int insertSelective(Login record);

    Login selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);

    List<Login> allLogin();
}