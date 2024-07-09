package org.example.mapper;//package com.itheima.mapper;

//import com.itheima.pojo.Dept;

//import org.apache.ibatis.annotations.Delete;
//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.Dept;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface DeptMapper {
    /**
     * 查询全部
     * @return
     */
    @Select("select * from STUDENT")
    List<Dept> list();

    /**
     * 根据ID删除部门
     * @param id
     */
    /**
     * 根据ID删除部门
     *
     * @param id
     */
    @Select("delete from STUDENT where ID = #{id}")
    void delete(Integer id);
}
