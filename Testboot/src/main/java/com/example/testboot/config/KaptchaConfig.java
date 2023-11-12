//package com.example.testboot.config;
//
//import com.google.code.kaptcha.impl.DefaultKaptcha;
//import com.google.code.kaptcha.util.Config;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Properties;
//
//@Configuration
//public class KaptchaConfig {
//
//    @Bean
//    public DefaultKaptcha captchaProducer() {
//        Properties properties = new Properties();
//        // 配置Kaptcha参数
//        properties.setProperty("kaptcha.image.width", "120");
//        properties.setProperty("kaptcha.image.height", "50");
//        // 更多配置参数...
//
//        Config config = new Config(properties);
//        DefaultKaptcha captchaProducer = new DefaultKaptcha();
//        captchaProducer.setConfig(config);
//        return captchaProducer;
//    }
//}
