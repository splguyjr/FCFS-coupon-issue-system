package com.example.coupon.common.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ApiResponse<T> {
    private boolean success;
    private T data;
    private String message;

    public static<T> ApiResponse<T> success(T data) {
        return ApiResponse.<T>builder()
                .success(true)
                .data(data)
                .build();
    }

    public static<T> ApiResponse<T> failure(Exception exception, String message) {
        return ApiResponse.<T>builder()
                .success(false)
                .message(exception.getMessage())
                .build();
    }
}
