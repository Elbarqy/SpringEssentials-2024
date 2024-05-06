package com.elbarqy.SpringFundamentals.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ControllerService {

    public String helloMessage() {
        return "Hello";
    }
}
