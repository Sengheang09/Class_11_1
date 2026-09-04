package com.example.project_class111.mapper;

import com.example.project_class111.dto.RequestDto.UserRequestDto;
import com.example.project_class111.dto.ResponseDto.UserResponseDto;
import com.example.project_class111.entity.User;

public class UserMapper {

    public static User toEntity(UserRequestDto requestDto) {
        if (requestDto == null) {
            return null;
        }
        User user = new User();
        user.setName(requestDto.getName());
        user.setEmail(requestDto.getEmail());
        user.setPassword(requestDto.getPassword());
        user.setRoel(requestDto.getRoel());
        return user;
    }

    public static UserResponseDto toResponseDto(User user) {
        if (user == null) {
            return null;
        }
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setId(user.getId());
        responseDto.setName(user.getName());
        responseDto.setEmail(user.getEmail());
        responseDto.setRoel(user.getRoel());
        responseDto.setCreateAt(user.getCreateAt());
        responseDto.setUpdateAt(user.getUpdateAt());
        return responseDto;
    }
}
