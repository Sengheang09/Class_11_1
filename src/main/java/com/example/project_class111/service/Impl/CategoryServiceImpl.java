package com.example.project_class111.service.Impl;

import com.example.project_class111.dto.RequestDto.CategoryRequestDto;
import com.example.project_class111.dto.ResponseDto.CategoryResponseDto;
import com.example.project_class111.entity.Category;
import com.example.project_class111.exception.BadRequestException;
import com.example.project_class111.exception.ResourceNotFoundException;
import com.example.project_class111.mapper.CategoryMapper;
import com.example.project_class111.repo.CategoryRepository;
import com.example.project_class111.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public CategoryResponseDto createCategory(CategoryRequestDto categoryRequestDto) {
        if (categoryRepository.existsByName(categoryRequestDto.getName())) {
            throw new BadRequestException("Category with name '" + categoryRequestDto.getName() + "' already exists");
        }

        Category category = CategoryMapper.toEntity(categoryRequestDto);
        Category saved = categoryRepository.save(category);
        return CategoryMapper.toResponseDto(saved);
    }

    @Override
    public CategoryResponseDto getCategoryById(Long id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Category not found with id: " + id));
        return CategoryMapper.toResponseDto(category);
    }

    @Override
    public List<CategoryResponseDto> getAllCategories() {
        return categoryRepository.findAll().stream()
                .map(CategoryMapper::toResponseDto)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryResponseDto updateCategory(Long id, CategoryRequestDto categoryRequestDto) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Category not found with id: " + id));

        if (!category.getName().equalsIgnoreCase(categoryRequestDto.getName())
                && categoryRepository.existsByName(categoryRequestDto.getName())) {
            throw new BadRequestException("Category with name '" + categoryRequestDto.getName() + "' already exists");
        }

        category.setName(categoryRequestDto.getName());
        category.setDescription(categoryRequestDto.getDescription());

        Category updated = categoryRepository.save(category);
        return CategoryMapper.toResponseDto(updated);
    }

    @Override
    public void deleteCategory(Long id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Category not found with id: " + id));
        categoryRepository.delete(category);
    }
}
