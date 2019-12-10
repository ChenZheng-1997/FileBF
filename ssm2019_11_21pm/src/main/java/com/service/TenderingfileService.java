package com.service;

import com.domain.Tenderingfile;
public interface TenderingfileService{


    int deleteByPrimaryKey(Integer id);

    int insert(Tenderingfile record);

    int insertSelective(Tenderingfile record);

    Tenderingfile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tenderingfile record);

    int updateByPrimaryKey(Tenderingfile record);

}
