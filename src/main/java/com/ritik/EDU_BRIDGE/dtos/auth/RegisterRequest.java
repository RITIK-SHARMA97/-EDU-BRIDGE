package com.ritik.EDU_BRIDGE.dtos.auth;

import com.ritik.EDU_BRIDGE.MODEL.Role;
import lombok.Data;

@Data
public class RegisterRequest {
    private  String name;
    private String email;
    private String password;
    private Role role;
}
