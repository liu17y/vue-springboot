package com.example.testboot.service;

import com.example.testboot.util.ResultData;

/**
 * (Teacher)表服务接口
 *
 * @author makejava
 * @since 2023-08-05 17:51:10
 */
public interface TeacherService {


    ResultData TeacherAllInfo(int pageNum, int pageSize);
}
