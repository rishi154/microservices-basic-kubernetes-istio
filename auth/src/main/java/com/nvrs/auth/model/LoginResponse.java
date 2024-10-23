package com.nvrs.auth.model;

import lombok.Data;

@Data
public class LoginResponse {
    private String token;

    private long expiresIn;
}
