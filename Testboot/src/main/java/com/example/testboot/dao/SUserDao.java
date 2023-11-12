package com.example.testboot.dao;

import com.example.testboot.entity.SUser;

import java.util.List;

/**
 * (SUser)表数据库访问层
 *
 * @author makejava
 * @since 2023-06-22 11:11:08
 */
public interface SUserDao {



    List<SUser> getAll();

    List<SUser> getAllList();

    void delete(Integer idcard);

    SUser getById(Integer idcard);


    void deleteOne(Integer idcard);

    void insertUser(SUser sUser);

    void updateById(SUser sUser);

    void updateId(SUser sUser);


    void updateStudent(Integer idcard, String username, String email, String phone, String address);

    Integer Insert(SUser sUser);

    Integer updateByIdOne(SUser sUser);

    void addInfo(SUser sUser);


    List<SUser> search(Integer idcard);


    SUser searchByIdcard(Integer idcard);

    List<SUser> searchByUsername(String username);



    SUser login(String username);

    SUser getsUser(String username);

    SUser getsUserInfo(String username);


    Integer getCount();

    int getTotal();

    List<SUser> getAllInfo(int startIndex, int pageSize);

    int deleteById(Integer integer);

    List<SUser> searchByname(String name);

    void registerInfo(SUser sUser);
}

