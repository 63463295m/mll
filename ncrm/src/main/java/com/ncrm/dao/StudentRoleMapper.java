package com.ncrm.dao;

import com.ncrm.entity.StudentRole;

public interface StudentRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentRole record);

    int insertSelective(StudentRole record);

    StudentRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentRole record);

    int updateByPrimaryKey(StudentRole record);
}