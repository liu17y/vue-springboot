package com.example.testboot.util;

import org.apache.shiro.crypto.hash.Md5Hash;

public class Md5Utils {
    //Md5加密
    public static String enCry(String username,String password){
        Md5Hash md5Hash = new Md5Hash(username, password,1000);
        String s = md5Hash.toString();
        return s;
    }

}
