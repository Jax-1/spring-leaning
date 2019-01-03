package com.spring.leaning;

import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Configuration
public class HttpFilterConfig  implements  Filter  {
    /**
     * 封装，不需要过滤的list列表
     */
    protected static List<Pattern> patterns = new ArrayList<Pattern>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest)servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse)servletResponse;
        String url = httpRequest.getRequestURI().substring(httpRequest.getContextPath().length()); //请求的url
        System.out.println("111111111111111111111");
        String module=httpRequest.getParameter("module");
        String action=httpRequest.getParameter("action");
        System.out.println("/"+module+"/"+action);
        httpRequest.getRequestDispatcher("/"+module+"/"+action).forward(httpRequest,httpResponse);
        filterChain.doFilter(httpRequest, httpResponse); // 发到controller方法时候，参数居然是有的。

    }

    /**
     * 是否需要过滤
     * @param url
     * @return
     */
    private boolean isInclude(String url) {
        for (Pattern pattern : patterns) {
            Matcher matcher = pattern.matcher(url);
            if (matcher.matches()) {
                return true;
            }
        }
        return false;
    }
    @Override
    public void destroy() {

    }
}
