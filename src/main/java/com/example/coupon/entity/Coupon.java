package com.example.coupon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private CouponType couponType;

    private CouponStatus status;

    private Integer discountValue;

    private Integer minOrderAmount;

    private Integer maxDiscountAmount;

    private Integer totalQuantity;

    private Integer issuedQuantity;

    private Integer validDays;

    private LocalDateTime startDate;

    private LocalDateTime endDate;
}
