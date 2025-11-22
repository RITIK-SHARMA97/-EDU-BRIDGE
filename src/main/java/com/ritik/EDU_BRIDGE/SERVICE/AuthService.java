package com.ritik.EDU_BRIDGE.SERVICE;

import com.ritik.EDU_BRIDGE.REPOSITORY.UserRepository;
import com.ritik.EDU_BRIDGE.UTIL.JWTUtil;
import com.ritik.EDU_BRIDGE.dtos.auth.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.init.UncategorizedScriptException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JWTUtil jwtUtil;



    public void register(RegisterRequest request){
        User user = new User()

    }









}
