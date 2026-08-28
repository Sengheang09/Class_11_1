package com.example.project_class111.dto.RequestDto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemRequestDto {

    @NotNull(message = "Product ID must not be null")
    private Long productId;

    private String description;

    @NotNull(message = "Price must not be null")
    @Positive(message = "Price must be positive")
    private BigDecimal price;
}
