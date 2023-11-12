package com.example.testboot.dao;

import com.example.testboot.entity.Menu;

import java.util.List;

public interface MenuDao {
    List<Menu> getMenuByName(String username);
}
