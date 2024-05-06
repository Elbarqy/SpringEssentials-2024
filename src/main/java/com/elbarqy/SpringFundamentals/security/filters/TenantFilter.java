package com.elbarqy.SpringFundamentals.security.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.util.logging.Logger;

@Slf4j
public class TenantFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String tenantId = request.getHeader("X-Tenant-Id");
//        if (tenantId == null) throw new AccessDeniedException("No tenant id found");
        response.addHeader("success", "true value");
        log.info("Requesting now....");
        chain.doFilter(request, response);
        return;
    }
}
