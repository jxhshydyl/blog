package com.lwp.blogcomment.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Auther: liuweipeng
 * @Date: 2019/5/15 15:35
 * @Description:
 */
@Component
public class MyFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        System.out.println(request.getCookies());
        System.out.println("===========blog-comment=================");
        System.out.println(request.getHeader("a"));
        System.out.println(request.getHeader("ui"));
        System.out.println(request.getHeader("comment"));
        System.out.println(request.getRequestURI());
        // 放行请求
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
    }
}
