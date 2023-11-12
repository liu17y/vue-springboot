package com.example.testboot.service.impl;

import com.example.testboot.dao.MenuDao;
import com.example.testboot.entity.Menu;
import com.example.testboot.service.MenuService;
import com.example.testboot.util.ResultData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("menuService")
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuDao menuDao;
    @Override
    public ResultData getMenuByName(String username) {
        List<Menu> menus = menuDao.getMenuByName(username);
        return new ResultData(200,"success",menus);
    }
}
