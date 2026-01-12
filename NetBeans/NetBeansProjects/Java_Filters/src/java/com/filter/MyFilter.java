package com.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;

public class MyFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
        System.out.println("Before Servlet");
        // ............
        // ............
        fc.doFilter(sr, sr1);
        System.out.println("After Servlet");
        // ............
        // ............
    }

    @Override
    public void destroy() {
        Filter.super.destroy(); 
    }
    
}
