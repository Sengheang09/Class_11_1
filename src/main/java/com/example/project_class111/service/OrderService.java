package com.example.project_class111.service;

import com.example.project_class111.dto.RequestDto.OrderRequestDto;
import com.example.project_class111.dto.ResponseDto.OrderResponseDto;

import java.util.List;

public interface OrderService {
    OrderResponseDto createOrder(OrderRequestDto orderRequestDto);
    OrderResponseDto getOrderById(Long id);
    List<OrderResponseDto> getAllOrders();
    List<OrderResponseDto> getOrdersByUserId(Long userId);
    OrderResponseDto updateOrderStatus(Long id, String status);
    void deleteOrder(Long id);
}
