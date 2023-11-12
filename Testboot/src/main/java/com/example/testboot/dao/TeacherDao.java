package com.example.testboot.dao;

import com.example.testboot.entity.Teacher;

import java.util.List;

/**
 * (Teacher)表数据库访问层
 *
 * @author makejava
 * @since 2023-08-05 17:51:09
 */
public interface TeacherDao {


    int getTatol(); //获取总条数

    List<Teacher> TeacherAllInfo(int start, int pageSize); //分页查询所有数据
}

