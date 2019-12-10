package com.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.TenderingfileMapper;
import com.domain.Tenderingfile;
import com.service.TenderingfileService;
@Service
public class TenderingfileServiceImpl implements TenderingfileService{

    @Resource
    private TenderingfileMapper tenderingfileMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tenderingfileMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Tenderingfile record) {
        return tenderingfileMapper.insert(record);
    }

    @Override
    public int insertSelective(Tenderingfile record) {
        return tenderingfileMapper.insertSelective(record);
    }

    @Override
    public Tenderingfile selectByPrimaryKey(Integer id) {
        return tenderingfileMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Tenderingfile record) {
        return tenderingfileMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Tenderingfile record) {
        return tenderingfileMapper.updateByPrimaryKey(record);
    }

}
