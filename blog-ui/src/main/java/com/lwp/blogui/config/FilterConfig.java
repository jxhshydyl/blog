package com.lwp.blogui.config;

import com.lwp.blogui.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: liuweipeng
 * @Date: 2019/5/5 16:47
 * @Description:
 */
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
