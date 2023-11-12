//package com.example.testboot.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//@Controller
//@RestController("localCode")
//@CrossOrigin("*")
//public class VerificationController {
//
//    @PostMapping("/verify")
//    public String verifyCaptcha(@RequestParam("userCode") String userCode, HttpServletRequest request) {
//        HttpSession session = request.getSession();
//        String captcha = (String) session.getAttribute("captcha");
//
//        if (captcha != null && captcha.equalsIgnoreCase(userCode)) {
//            // 验证码匹配，执行相应的逻辑
//            return "success"; // 返回成功页面
//        } else {
//            // 验证码不匹配，执行相应的逻辑
//            return "error"; // 返回错误页面
//        }
//    }
//}
