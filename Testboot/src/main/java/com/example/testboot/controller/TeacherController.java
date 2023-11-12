package com.example.testboot.controller;

import com.example.testboot.service.TeacherService;
import com.example.testboot.util.ResultData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Teacher)表控制层
 *
 * @author makejava
 * @since 2023-08-05 17:51:08
 */
@RestController
@RequestMapping("teacher")
//@CrossOrigin("*")
public class TeacherController {

    @Resource
    private TeacherService teacherService;
    /**
     * 分页查询所有数据
     */
     @RequestMapping("/allInfo")
    public ResultData TeacherAllInfo(@RequestParam int pageNum,@RequestParam int pageSize) {
        ResultData resultData = teacherService.TeacherAllInfo(pageNum,pageSize);
        return resultData;
    }


}

