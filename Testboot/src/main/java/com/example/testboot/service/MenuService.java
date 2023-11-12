package com.example.testboot.service;

import com.example.testboot.util.ResultData;

/**
 * (Menu)表服务接口
 *
 * @author makejava
 * @since 2023-07-04 14:24:11
 */
public interface MenuService {

    ResultData getMenuByName(String username);
}
