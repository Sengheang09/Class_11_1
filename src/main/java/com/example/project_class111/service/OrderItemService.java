package com.example.project_class111.service;

import com.example.project_class111.dto.RequestDto.OrderItemRequestDto;
import com.example.project_class111.dto.ResponseDto.OrderItemResponseDto;

import java.util.List;

public interface OrderItemService {

    OrderItemResponseDto createOrderItem(Long orderId, OrderItemRequestDto orderItemRequestDto);

    OrderItemResponseDto getOrderItemById(Long id);

    List<OrderItemResponseDto> getOrderItemsByOrderId(Long orderId);

    void deleteOrderItem(Long id);

}
