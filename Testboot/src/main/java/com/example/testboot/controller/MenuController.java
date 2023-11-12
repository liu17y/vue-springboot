package com.example.testboot.controller;

import com.example.testboot.service.MenuService;
import com.example.testboot.util.ResultData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("menu")
public class MenuController {

    /**
     * 根据用户名输出导航栏
     */
    @Resource
    private MenuService menuService;
    @RequestMapping("/menuIfo")
    public ResultData getMenuByName(String username) {
        ResultData resultData = menuService.getMenuByName(username);
        return resultData;
    }

}
