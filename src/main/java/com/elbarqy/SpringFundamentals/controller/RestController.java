package com.elbarqy.SpringFundamentals.controller;

import com.elbarqy.SpringFundamentals.annotations.AnalyzeHeader;
import com.elbarqy.SpringFundamentals.service.ControllerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@org.springframework.web.bind.annotation.RestController
@AllArgsConstructor
public class RestController {
    private ControllerService service;
    @GetMapping
    public String hello() {
        return service.helloMessage();
    }

    @GetMapping("test")
    @AnalyzeHeader(headerName = "madness", valueToAppend = "defiled")
    public String customEndpoint() {
        return "works";
    }
}
