package com.xujin.study.service;

import com.xujin.study.mapper.DeptMapper;
import com.xujin.study.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeptService implements DeptMapper {
    @Autowired
    DeptMapper deptMapper;

    @Override
    public  List<Dept> queryAll() {
        List<Dept> list=  deptMapper.queryAll();
        return list;
    }
}
