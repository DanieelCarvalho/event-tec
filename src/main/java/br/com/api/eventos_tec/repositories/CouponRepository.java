package br.com.api.eventos_tec.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.eventos_tec.domain.coupon.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, UUID> {

}
