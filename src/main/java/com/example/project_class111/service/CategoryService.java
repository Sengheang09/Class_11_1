package com.example.project_class111.service;

import com.example.project_class111.dto.RequestDto.CategoryRequestDto;
import com.example.project_class111.dto.ResponseDto.CategoryResponseDto;

import java.util.List;

public interface CategoryService {
    CategoryResponseDto createCategory(CategoryRequestDto categoryRequestDto);
    CategoryResponseDto getCategoryById(Long id);
    List<CategoryResponseDto> getAllCategories();
    CategoryResponseDto updateCategory(Long id, CategoryRequestDto categoryRequestDto);
    void deleteCategory(Long id);
}
