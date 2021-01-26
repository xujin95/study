package com.xujin.study.mapper;

import com.xujin.study.model.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface DeptMapper {
    List<Dept> queryAll();
}
