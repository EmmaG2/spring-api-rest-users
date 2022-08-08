package com.example.springCourse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedHeaders("Access-Control-Allow-Origin",
                "*",
                "Access-Control-Allow-Methods",
                "POST, GET, OPTIONS, PUT, DELETE",
                "Access-Control-Allow-Headers",
                "Origin, X-Requested-With, Content-Type, Accept")
                .allowedOrigins("*")
                .allowedMethods("*");

    }
}
