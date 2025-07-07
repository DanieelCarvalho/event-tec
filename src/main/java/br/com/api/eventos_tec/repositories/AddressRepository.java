package br.com.api.eventos_tec.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.eventos_tec.domain.model.address.Address;

public interface AddressRepository extends JpaRepository<Address, UUID> {

}
