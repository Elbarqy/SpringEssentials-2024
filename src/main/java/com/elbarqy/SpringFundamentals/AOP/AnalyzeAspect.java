package com.elbarqy.SpringFundamentals.AOP;

import com.elbarqy.SpringFundamentals.annotations.AnalyzeHeader;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class AnalyzeAspect {
    @Before("@annotation(analyzeHeader)")
    public void analyzeHeader(AnalyzeHeader analyzeHeader) {
        HttpServletRequest request = (HttpServletRequest) ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpServletResponse response = (HttpServletResponse) ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();

        String headerValue = request.getHeader(analyzeHeader.headerName());
        if (headerValue != null) {
            System.out.println("Picking up on the aspect");
            System.out.println("Appending value "+ analyzeHeader.valueToAppend());
            assert response != null;
            response.setHeader(headerValue, analyzeHeader.valueToAppend());
        }
    }
}
