package com.spring.leaning;

import com.spring.leaning.filter.HttpRequestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class HttpFilterConfig  extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new HttpRequestFilter()).addPathPatterns("/**").excludePathPatterns(
//                "/User/login"
//        );
        super.addInterceptors(registry);
    }
}
