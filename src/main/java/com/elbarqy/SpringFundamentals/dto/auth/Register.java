package com.elbarqy.SpringFundamentals.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Register {
    private String username;
    private String password;
}
