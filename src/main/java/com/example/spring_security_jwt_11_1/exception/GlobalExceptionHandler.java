package com.example.spring_security_jwt_11_1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(
            ResourceNotFoundException ex
    ) {

//        Map<String,Object> map = new HashMap<>();
//        map.put("message", ex.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
               Map.of("Message: ", ex.getMessage())
        );
    }
}
