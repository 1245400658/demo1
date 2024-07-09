package org.example.controller;//package com.itheima.controller;

//import com.itheima.pojo.Dept;

//import com.itheima.pojo.Result;

import lombok.extern.slf4j.Slf4j;
import org.example.pojo.Dept;
import org.example.pojo.Result;
import org.example.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理Controller
 */
@Slf4j
@RequestMapping("/depts")
@RestController
public class DeptController {

    //private static Logger log = LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private DeptService deptService;

    /**
     * 查询部门数据
     * @return
     */
    //@RequestMapping(value = "/depts",method = RequestMethod.GET) //指定请求方式为GET
    @GetMapping
    public Result list(){
        log.info("查询全部数据");
        //调用service查询部门数据
        List<Dept> deptList =  deptService.list();
        return Result.success(deptList);
    }


//    @DeleteMapping("/{id}")
//    public Result delete(@PathVariable Integer id){
//        log.info("根据id删除:{}",id);
//        //调用service删除部门
//        deptService.delete(id);
//        return Result.success();
//    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除:{}",id);
        //调用service删除部门
        deptService.delete(id);
        return Result.success();
    }
    ////
//
//    /**
//     * 新增部门
//     * @return
//     */
    @PostMapping("/add")
    public Result add(@RequestBody Dept dept){
        log.info("新增部门: {}" , dept);
        //调用service新增部门
        deptService.add(dept);
        return Result.success();
    }


}
