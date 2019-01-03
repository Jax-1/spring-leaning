package com.spring.leaning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class LeaningApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeaningApplication.class, args);
    }

    /**
     * 注册过滤器
     * @return
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {

        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new HttpFilterConfig());
        List<String> urlPatterns = new ArrayList<String>();

        urlPatterns.add("/index.action"); //这个请求会走filter。 比如是/api/product/out/list就不会走filter



        registrationBean.setUrlPatterns(urlPatterns);
        return registrationBean;

    }

}

