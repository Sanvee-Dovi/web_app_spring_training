package fr.lernejo.todo;

import org.springframework.stereotype.Component;


import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@Component
public class ApplicationIdentifierFilter implements Filter {
    private final String key;
    public ApplicationIdentifierFilter(){
        UUID uuid = UUID.randomUUID();
        this.key = uuid.toString();
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {


        if(servletResponse instanceof HttpServletResponse httpServletResponse){
            httpServletResponse.setHeader("Instance-Id",key);
            filterChain.doFilter(servletRequest, httpServletResponse);
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
