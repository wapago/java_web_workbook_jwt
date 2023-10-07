package org.zerock.api01.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CustomServletConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // localhost:8080/files/sample.html 404 error
        registry.addResourceHandler("/files/**").addResourceLocations("classpath:/static/");

        // localhost:8080/files/sample.html 가능
//        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");

    }
}
