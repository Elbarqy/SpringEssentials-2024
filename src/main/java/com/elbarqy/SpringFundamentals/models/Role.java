package com.elbarqy.SpringFundamentals.models;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.HashSet;

public enum Role {
    MegaAdim("MegaAdmin"),
    Admin("Admin"),
    User("User"),
    Guest("Guest");
    private final String roleName;

    Role(String role) {
        this.roleName = role;
    }

    public HashSet<? extends GrantedAuthority> getGrantedAuth(String role) {
        HashSet<GrantedAuthority> auths = new HashSet<>();
        auths.add(new SimpleGrantedAuthority(role));
        return auths;
    }
}
