package com.baxicar.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ADMIN, DRIVER, PASSENGER, MODERATOR;

    @Override
    public String getAuthority() {
        return name();
    }
}
