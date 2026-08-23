package com.example.project_class111.dto.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponseDto {
    private Long id;

    private String name;

    private String description;

    private BigDecimal price;

    private String imageUrl;

    private int stock;

    private Long categoryId;

    private String categoryName;
}
