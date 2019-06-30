package com.lwp.blogui.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: liuweipeng
 * @Date: 2019/5/5 16:43
 * @Description:
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;
        if("ui".equals(request.getHeader("ui"))){
            //放行请求
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            //重定向
            response.sendRedirect("http://localhost:8082/ui/index.html");
            //转发
            //servletRequest.getRequestDispatcher("").forward(request, response);
        }
    }

    @Override
    public void destroy() {
    }
}
