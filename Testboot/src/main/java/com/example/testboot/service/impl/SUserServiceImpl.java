package com.example.testboot.service.impl;

import com.example.testboot.dao.SUserDao;
import com.example.testboot.entity.SUser;
import com.example.testboot.service.SUserService;
import com.example.testboot.util.Md5Utils;
import com.example.testboot.util.ResultData;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SUser)表服务实现类
 *
 * @author makejava
 * @since 2023-06-22 11:11:09
 */
@Service("sUserService")
public class SUserServiceImpl implements SUserService {
    @Resource
    private SUserDao sUserDao;


    @Override
    public ResultData getAll() {
        List<SUser> sUsers = sUserDao.getAll();
        return new ResultData(200,"查询成功",sUsers);
    }

    @Override
    public List<SUser> getAllList() {
        return sUserDao.getAllList();
    }

    @Override
    public void delete(Integer idcard) {
        sUserDao.delete(idcard);
    }

    @Override
    public SUser getById(Integer idcard) {
        return sUserDao.getById(idcard);
    }


    @Override
    public void deleteOne(Integer idcard) {
        sUserDao.deleteOne(idcard);
    }

    @Override
    public void insertUser(SUser sUser) {
        sUserDao.insertUser(sUser);
    }

    @Override
    public void updateById(SUser sUser) {
        sUserDao.updateById(sUser);
    }

    @Override
    public void updateId(SUser sUser) {
        sUserDao.updateId(sUser);
    }



    @Override
    public void updateStudent(Integer idcard, String username, String email, String phone, String address) {
        sUserDao.updateStudent(idcard,username,email,phone,address);
    }

    @Override
    public Integer Insert(SUser sUser) {
        if(sUser.getUsername() == null || sUser.getUsername().equals("")){ // 判断⽤户名是否为空
            return sUserDao.Insert(sUser); // 调⽤mapper层的⽅法 实现插⼊数据
        }else{ //否则更新数据
            return sUserDao.updateByIdOne(sUser);
        }
    }

    @Override
    public void addInfo(SUser sUser) {
        //调用数据访问层保存用户信息
        sUserDao.addInfo(sUser);

    }

    @Override
    public ResultData search(Integer idcard) {
        List<SUser> sUsers = sUserDao.search(idcard);
        return new ResultData(200,"查询成功",sUsers);
    }


    @Override
    public ResultData login(String username, String password) {
        SUser sUser = sUserDao.getsUser(username);
        if (sUser != null) {

            String enCry = Md5Utils.enCry(password,username);

            if (enCry.equals(sUser.getPassword())) {
                return new ResultData(200, "登录成功", sUser);

            } else {
                return new ResultData(501, "用户名不存在或密码错误", null);
            }
        } else {
            ResultData result = new ResultData(502, "用户名不存在或密码错误", null);
            return result;
        }
    }

    @Override
    public void login2(String username, String password) {
        SUser sUser = sUserDao.getsUserInfo(username);
        if(sUser != null){
            if(password.equals(sUser.getPassword())){
                System.out.println("登录成功");
            }else{
                System.out.println("登录失败");
            }
        }else{
            System.out.println("用户名不存在");
        }
    }


    @Override
    public ResultData getAllInfo(int pageNum, int pageSize) {
        // 业务逻辑
        int startIndex = (pageNum - 1) * pageSize;
        //  获取总条数
        int total = sUserDao.getTotal();
        // 获取当前页的数据
        List<SUser> sUsers = sUserDao.getAllInfo(startIndex,pageSize);
        // 封装数据
        ResultData resultData = new ResultData(0,"",total,sUsers);
        return resultData;
    }

    @Override
    public ResultData deleteById(Integer[] idcard) {
        for ( int i = 0; i < idcard.length; i++){

            int i1 = sUserDao.deleteById(idcard[i]);
        }
        return new ResultData(500, "删除失败", null);
    }

    @Override
    public ResultData searchByname(String name) {
        List<SUser> sUsers = sUserDao.searchByname(name);
        return new ResultData(200,"查询成功",sUsers);
    }

    @Override
    public void registerInfo(SUser sUser) {
        String password = sUser.getPassword();
        String username = sUser.getUsername();
        //对密码进行加密
        Md5Hash md5Hash = new Md5Hash(password, username, 1000);
        String encryptePassword = md5Hash.toString();
        //将加密后的密码设置为返回对象
        sUser.setPassword(encryptePassword);
        //调用数据访问层保存用户信息
        sUserDao.registerInfo(sUser);
    }

//    public static void main(String[] args) {
//        Md5Hash md5Hash = new Md5Hash("123456", "liuzongyi", 10000);
//        String encryptePassword = md5Hash.toString();
//        System.out.println(encryptePassword);
//        //9cc211bad9f019ab1cdd39a841e05077
//        //c17510be6b4b48ca75d153f82fcc6738
//        //c90e1ede1381e7ea05f5be14ce5a1d4f
//    }

}
