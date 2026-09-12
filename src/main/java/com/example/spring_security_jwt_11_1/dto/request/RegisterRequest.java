package com.example.spring_security_jwt_11_1.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RegisterRequest {

    @NotNull(message = "name is required")
    private String username;

    @NotNull(message = "email is required")
    private String email;

    @NotNull(message = "password is required")
    private String password;

}
