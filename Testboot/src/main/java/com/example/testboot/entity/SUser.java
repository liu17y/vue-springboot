package com.example.testboot.entity;

import java.io.Serializable;

/**
 * (SUser)实体类
 *
 * @author makejava
 * @since 2023-07-03 11:00:02
 */
public class SUser implements Serializable {
    private static final long serialVersionUID = 993054977063309854L;
    /**
     * 编号
     */
    private Integer idcard;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private transient String password;
    /**
     * 邮件
     */
    private String email;
    /**
     * 电话号码
     */
    private String phone;
    /**
     * 地址
     */
    private String address;
    /**
     * 姓名
     */
    private String name;

    /**
     * 图片
     */
    private byte[] image;

    // 添加 getter 和 setter 方法
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    public Integer getIdcard() {
        return idcard;
    }

    public void setIdcard(Integer idcard) {
        this.idcard = idcard;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SUser{" +
                "idcard=" + idcard +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

