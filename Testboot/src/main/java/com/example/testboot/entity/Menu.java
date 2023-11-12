package com.example.testboot.entity;

import java.io.Serializable;

/**
 * (Menu)实体类
 *
 * @author makejava
 * @since 2023-06-08 16:30:21
 */
public class Menu implements Serializable {
    private static final long serialVersionUID = 160186675006529845L;
    /**
     * 菜单编号
     */
    private Integer id;
    /**
     * 菜单名称
     */
    private String name;
    /**
     * 菜单对应的路由地址
     */
    private String route;
    /**
     * 菜单图标
     */
    private String icon;
    /**
     * 菜单排序编号
     */
    private Integer orders;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

}
