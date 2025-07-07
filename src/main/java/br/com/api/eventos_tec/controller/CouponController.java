package br.com.api.eventos_tec.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.eventos_tec.domain.dto.CouponRequestDTO;
import br.com.api.eventos_tec.domain.model.coupon.Coupon;
import br.com.api.eventos_tec.service.CouponService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/coupon")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @PostMapping("/event/{eventId}")
    public ResponseEntity<Coupon> addCouponsToEvent(@PathVariable UUID eventId, @RequestBody CouponRequestDTO data) {
        Coupon coupons = couponService.addCouponsToEvent(eventId, data);
        return ResponseEntity.ok(coupons);
    }

}
