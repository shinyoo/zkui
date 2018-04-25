package com.deem.zkui.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebFilter(filterName = "filtercharset", urlPatterns = "/*")
public class CharsetFilter implements Filter {
    @Override
    public void init(FilterConfig fc) throws ServletException {

        //Do Nothing
    }



    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        request.setCharacterEncoding(StandardCharsets.UTF_8.toString());
        response.setCharacterEncoding(StandardCharsets.UTF_8.toString());

        fc.doFilter(req, res);
    }

    @Override
    public void destroy() {
        //Do nothing
    }
}
