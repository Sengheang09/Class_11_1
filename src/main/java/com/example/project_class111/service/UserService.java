package com.example.project_class111.service;

import com.example.project_class111.dto.RequestDto.UserRequestDto;
import com.example.project_class111.dto.ResponseDto.UserResponseDto;

import java.util.List;

public interface UserService {
    UserResponseDto createUser(UserRequestDto userRequestDto);
    UserResponseDto getUserById(Long id);
    List<UserResponseDto> getAllUsers();
    UserResponseDto updateUser(Long id, UserRequestDto userRequestDto);
    void deleteUser(Long id);
}
