package com.elbarqy.SpringFundamentals.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/auth")
public class AuthController {
    @GetMapping("/login")
    public String login() {
        return "";
    }
}
