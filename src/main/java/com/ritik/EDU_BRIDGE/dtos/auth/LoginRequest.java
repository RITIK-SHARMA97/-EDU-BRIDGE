package com.ritik.EDU_BRIDGE.dtos.auth;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;

}
