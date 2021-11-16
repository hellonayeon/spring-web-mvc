package me.hellonayeon;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter Init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter");
        filterChain.doFilter(servletRequest, servletResponse); // 다음 필터로 연결 (체인)
    }

    @Override
    public void destroy() {
        System.out.println("Filter Destroy");
    }
}
