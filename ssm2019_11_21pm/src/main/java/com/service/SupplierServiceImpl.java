package com.service;

import com.domain.Supplier;
import com.mapper.SupplierMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService{

    @Resource
    private SupplierMapper supplierMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return supplierMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Supplier record) {
        return supplierMapper.insert(record);
    }

    @Override
    public int insertSelective(Supplier record) {
        return supplierMapper.insertSelective(record);
    }

    @Override
    public Supplier selectByPrimaryKey(Integer id) {
        return supplierMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Supplier record) {
        return supplierMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Supplier record) {
        return supplierMapper.updateByPrimaryKey(record);
    }


    /**
     * 根据sgin查询供应商
     * @param supplier
     * @return
     */
    @Override
    public List<Supplier> selectSupplierBySign(Supplier supplier) {
        return supplierMapper.select(supplier);
    }

}
