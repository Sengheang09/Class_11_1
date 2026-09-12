package com.example.spring_security_jwt_11_1.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class LoginResponse {

    private String username;

    private String token;

    private String role;

}
