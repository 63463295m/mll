package com.ncrm.dao;

import com.ncrm.entity.Classes;

public interface ClassesMapper {
    /**
     *web - 1
     * 
     * Local - eclipse - 1
     */
    int deleteByPrimaryKey(Integer id);

    int insert(Classes record);

    int insertSelective(Classes record);

    Classes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classes record);

    int updateByPrimaryKey(Classes record);
}
