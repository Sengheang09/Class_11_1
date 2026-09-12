package com.example.spring_security_jwt_11_1.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
// this use to response after register acc
public class MessageResponse {

    private String message;

}
