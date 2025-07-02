package br.com.api.eventos_tec.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Address extends JpaRepository<Address, UUID> {

}
