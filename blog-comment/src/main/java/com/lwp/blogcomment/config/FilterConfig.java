package com.lwp.blogcomment.config;

import com.lwp.blogcomment.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean myFliter(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        // 1.注入过滤器
        filterRegistrationBean.setFilter(new MyFilter());
        // 2.配置拦截规则
        filterRegistrationBean.addUrlPatterns("/*");
        // 3.设置过滤器名称
        filterRegistrationBean.setName("myFliter");
        return filterRegistrationBean;
    }
}