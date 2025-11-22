package com.ritik.EDU_BRIDGE.CONTROLLER;

import com.ritik.EDU_BRIDGE.SERVICE.AuthService;
import com.ritik.EDU_BRIDGE.dtos.auth.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request){
        authService.register(request);
        return
                ResponseEntity.ok("User registered successfully");
    }
}
