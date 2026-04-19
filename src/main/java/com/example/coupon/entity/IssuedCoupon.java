package com.example.coupon.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class IssuedCoupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Coupon coupon;

    private Long userId;

    private IssueStatus status;

    private LocalDateTime issuedAt;

    private LocalDateTime expiredAt;

    private LocalDateTime usedAt;
}
