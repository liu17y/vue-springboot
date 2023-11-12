//package com.example.testboot.controller;
//
//import com.google.code.kaptcha.impl.DefaultKaptcha;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.imageio.ImageIO;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.awt.image.BufferedImage;
//import java.io.ByteArrayOutputStream;
//
//@Controller
//@RestController("localCode")
//@CrossOrigin("*")
//public class CaptchaController {
//
//    private final DefaultKaptcha captchaProducer;
//
//    @Autowired
//    public CaptchaController(DefaultKaptcha captchaProducer) {
//        this.captchaProducer = captchaProducer;
//    }
//
//    @GetMapping("/captcha")
//    public @ResponseBody
//    void getCaptcha(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        // 生成验证码文本
//        String captchaText = captchaProducer.createText();
//
//        // 将验证码文本存储在会话中
//        request.getSession().setAttribute("captcha", captchaText);
//
//        // 创建验证码图片
//        BufferedImage captchaImage = captchaProducer.createImage(captchaText);
//
//        // 将验证码图片转换为字节数组
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        ImageIO.write(captchaImage, "png", outputStream);
//        byte[] captchaBytes = outputStream.toByteArray();
//
//        // 设置响应头信息
//        response.setHeader("Cache-Control", "no-store");
//        response.setHeader("Pragma", "no-cache");
//        response.setContentType("image/png");
//
//        // 将验证码图片写入响应流
//        response.getOutputStream().write(captchaBytes);
//        response.getOutputStream().flush();
//        response.getOutputStream().close();
//    }
//}
