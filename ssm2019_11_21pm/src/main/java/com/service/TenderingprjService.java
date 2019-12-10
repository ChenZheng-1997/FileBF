package com.service;

import com.domain.Tenderingprj;

public interface TenderingprjService {


    int deleteByPrimaryKey(Integer id);

    int insert(Tenderingprj record);

    int insertSelective(Tenderingprj record);

    Tenderingprj selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tenderingprj record);

    int updateByPrimaryKey(Tenderingprj record);




}
