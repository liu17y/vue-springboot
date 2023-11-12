package com.example.testboot.service.impl;

import com.example.testboot.dao.TeacherDao;
import com.example.testboot.entity.Teacher;
import com.example.testboot.service.TeacherService;
import com.example.testboot.util.ResultData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Teacher)表服务实现类
 *
 * @author makejava
 * @since 2023-08-05 17:51:10
 */
@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherDao teacherDao;

    @Override
    public ResultData TeacherAllInfo(int pageNum, int pageSize) {
        //业务逻辑
        int start = (pageNum-1)*pageSize;

        int tatol = teacherDao.getTatol();
        // 获取当前页的数据
        List<Teacher> teachers = teacherDao.TeacherAllInfo(start,pageSize);
        return new ResultData(200,"success",tatol,teachers);
    }
}
