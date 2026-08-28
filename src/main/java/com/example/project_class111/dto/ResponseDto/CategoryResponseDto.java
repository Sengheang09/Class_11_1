package com.example.project_class111.dto.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryResponseDto {

    private Long id;
    private String name;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
