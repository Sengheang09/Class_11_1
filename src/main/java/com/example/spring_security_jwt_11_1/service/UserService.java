package com.example.spring_security_jwt_11_1.service;

import com.example.spring_security_jwt_11_1.dto.request.LoginRequest;
import com.example.spring_security_jwt_11_1.dto.request.RegisterRequest;
import com.example.spring_security_jwt_11_1.dto.response.LoginResponse;
import com.example.spring_security_jwt_11_1.dto.response.MessageResponse;

public interface UserService {

    MessageResponse createUser(RegisterRequest request);

    LoginResponse login(LoginRequest request);
}
