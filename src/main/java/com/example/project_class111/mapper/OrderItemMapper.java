package com.example.project_class111.mapper;

import com.example.project_class111.dto.RequestDto.OrderItemRequestDto;
import com.example.project_class111.dto.ResponseDto.OrderItemResponseDto;
import com.example.project_class111.entity.OrderItem;
import com.example.project_class111.entity.Product;

public class OrderItemMapper {

    public static OrderItem toEntity(OrderItemRequestDto requestDto) {
        if (requestDto == null) {
            return null;
        }
        OrderItem orderItem = new OrderItem();
        orderItem.setPrice(requestDto.getPrice());
        return orderItem;
    }

    public static OrderItemResponseDto toResponseDto(OrderItem orderItem) {
        if (orderItem == null) {
            return null;
        }
        OrderItemResponseDto responseDto = new OrderItemResponseDto();
        responseDto.setId(orderItem.getId());
        responseDto.setDescription(orderItem.getDescription());
        responseDto.setPrice(orderItem.getPrice());

        Product product = orderItem.getProduct();
        if (product != null) {
            responseDto.setProductId(product.getId());
            responseDto.setProductName(product.getName());
        }
        return responseDto;
    }
}
