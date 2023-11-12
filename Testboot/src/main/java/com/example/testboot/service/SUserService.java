package com.example.testboot.service;

import com.example.testboot.entity.SUser;
import com.example.testboot.util.ResultData;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (SUser)表服务接口
 *
 * @author makejava
 * @since 2023-06-22 11:11:09
 */
@Service
public interface SUserService {


    ResultData getAll();

    List<SUser> getAllList();

    void delete(Integer idcard);


    SUser getById(Integer idcard);



    void deleteOne(Integer idcard);

    void insertUser(SUser sUser);

    void updateById(SUser sUser);

    void updateId(SUser sUser);


    void updateStudent(Integer idcard, String username, String email, String phone, String address);

    Integer Insert(SUser sUser);

    void addInfo(SUser sUser);


    ResultData search(Integer idcard);



    ResultData login(String username, String password);

    void login2(String username, String password);


    ResultData getAllInfo(int pageNum, int pageSize);

    ResultData deleteById(Integer[] idcard);

    ResultData searchByname(String name);

    void registerInfo(SUser sUser);


//    List<SUser> getAllStudents(int pageSize, int currentPage);
}
