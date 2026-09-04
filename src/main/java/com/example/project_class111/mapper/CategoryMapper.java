package com.example.project_class111.mapper;

import com.example.project_class111.dto.RequestDto.CategoryRequestDto;
import com.example.project_class111.dto.ResponseDto.CategoryResponseDto;
import com.example.project_class111.entity.Category;

public class CategoryMapper {

    public static Category toEntity(CategoryRequestDto requestDto) {
        if (requestDto == null) {
            return null;
        }
        Category category = new Category();
        category.setName(requestDto.getName());
        category.setDescription(requestDto.getDescription());
        return category;
    }

    public static CategoryResponseDto toResponseDto(Category category) {
        if (category == null) {
            return null;
        }
        CategoryResponseDto responseDto = new CategoryResponseDto();
        responseDto.setId(category.getId());
        responseDto.setName(category.getName());
        responseDto.setDescription(category.getDescription());
        responseDto.setCreateAt(category.getCreateAt());
        responseDto.setUpdateAt(category.getUpdateAt());
        return responseDto;
    }
}
