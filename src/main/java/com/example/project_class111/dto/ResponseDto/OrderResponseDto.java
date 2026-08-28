package com.example.project_class111.dto.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponseDto {

    private Long id;
    private LocalDateTime orderData;
    private BigDecimal totalAmount;
    private String status;
    private Long userId;
    private String userName;
    private List<OrderItemResponseDto> orderItems;
}
