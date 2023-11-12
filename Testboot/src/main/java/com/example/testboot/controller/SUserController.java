package com.example.testboot.controller;


import com.example.testboot.entity.SUser;
import com.example.testboot.service.SUserService;
import com.example.testboot.util.ResultData;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (SUser)表控制层
 *
 * @author makejava
 * @since 2023-06-22 11:11:08
 */
@RestController
@RequestMapping("sUser")
//@CrossOrigin("*")
public class SUserController {
    /**
          * 服务对象
          */
    @Resource
    private SUserService sUserService;


    @RequestMapping("/api/login")
    public ResultData login( String username, String password) {
        // 处理业务  创建业务层
        ResultData result = sUserService.login(username, password);
        //封装结果
        return result;
    }

    @RequestMapping("/login")
    public List<SUser> login2(String username,String password) {
        // 处理业务  创建业务层
        sUserService.login2(username, password);
        //封装结果
        return new ArrayList<>();

    }

    /**
        *查询所有用户
        * @param
        * @return
     */

    @RequestMapping("/allInfo")
    public ResultData getAll() {
        ResultData userList = sUserService.getAll(); // 调用 UserService 中的 findAll() 方法查询所有用户信息
        return userList;
    }
    @RequestMapping("/allInfo2")
    public String getAll2() {
        return "hello"; // 调用 UserService 中的 findAll() 方法查询所有用户信息
    }

    /**
        *查询所有用户2
        * @param
        * @return
     */
    @RequestMapping("/all")
    public List<SUser> getAllList() {
        return sUserService.getAllList(); // 调用 UserService 中的 getAllList 方法查询所有用户信息
    }

    /**
        *根据id删除用户
        * @param
        * @return
     */
    @RequestMapping("/delete/{id}")
//   在postman中测试 public void delete(@PathVariable("id") Integer id) {
    public void delete(@PathVariable("id") Integer idcard) {
        sUserService.delete(idcard); // 调用 UserService 中的 delete 方法删除用户信息
    }

    /**
     * 批量删除
     * @param idcard
     * @return
     * */
    @RequestMapping("/deleteAll")
    public ResultData deleteById(@RequestBody Integer[] idcard){
        ResultData resultData = sUserService.deleteById(idcard);
        return resultData;
    }


    @RequestMapping("/delete")
    public void deleteOne(Integer idcard) {
        sUserService.deleteOne(idcard); // 调用 UserService 中的 deleteOne 方法删除用户信息
    }

    /**
        *根据id查询用户
        * @param
        * @return
     */
    @RequestMapping("/getById/{id}")
    public SUser getById(@PathVariable("id") Integer idcard) {
         return sUserService.getById(idcard); // 调用 UserService 中的 queryById 方法查询用户信息
    }

    /**
     * 用户注册
     * @param sUser
     * @return
     */
    @RequestMapping("/add")
    public void addInfo(@RequestBody SUser sUser){
       sUserService.addInfo(sUser); // 调用 UserService 中的 add 方法添加用户信息
    }

    /**
     *添加用户
     * @param
     * @return
     */
    @RequestMapping("/register")
    public void register(@RequestBody SUser sUser){
         sUserService.registerInfo(sUser);
    }

    @PostMapping("/insert")
    public void insertUser(SUser sUser){
        sUserService.insertUser(sUser);
    }

    /**
     *更新用户
     * @param
     * @return
     */
    @RequestMapping("/update")
//    @PostMapping("/update")
    public void updateById(SUser sUser) {
        sUserService.updateById(sUser); // 调用 UserService 中的 add 方法添加用户信息
    }


    /**
     * 修改
     * @param sUser
     * @return
     * */
   @PostMapping("/updateId")
    public void updateId(SUser sUser) {
        sUserService.updateId(sUser);
    }

    @PostMapping("/updateId2")
    public String updateStudent(@RequestParam Integer idcard, @RequestParam String username, @RequestParam String email, @RequestParam String phone, @RequestParam String address) {
        sUserService.updateStudent(idcard, username, email, phone, address);
        return "success";
    }




    @RequestMapping("/save")
    // 更新
    public Integer Insert(@RequestBody SUser sUser) { // 在前台⻚⾯中使⽤ajax传递json数据 后台使⽤@RequestBody接收
        return sUserService.Insert(sUser); // 使⽤mybatis的注解
    }

    /**
     * 搜索功能
     * @param  idcard,username
     * @return
     * */

    @RequestMapping("/search")
    public ResultData search(@RequestParam Integer idcard) {
        ResultData resultData = sUserService.search(idcard);
        return resultData;
    }

    @RequestMapping("/search2")
    public ResultData search2(@RequestParam String name){
        ResultData resultData = sUserService.searchByname(name);
        return resultData;
    }

    //分页查询，当前页数，每页显示的条数，总条数，总页数，当前页的数据，上一页，下一页，首页，尾页
    @RequestMapping("/allPage")
    public ResultData getAllInfo(@RequestParam int pageNum, @RequestParam int pageSize) {
        ResultData resultData = sUserService.getAllInfo(pageNum, pageSize);
        return resultData;

    }

}


