package com.example.testboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true); // 允许使用凭据
//        config.addAllowedOriginPattern("http://localhost:8080/"); // 允许来自任何源的请求
        config.addAllowedOrigin("http://localhost:8080");
        config.addAllowedHeader("*"); // 允许任何标头
        config.addAllowedMethod("*"); // 允许任何HTTP方法
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
