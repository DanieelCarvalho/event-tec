package br.com.api.eventos_tec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.eventos_tec.domain.dto.EventRequestDTO;
import br.com.api.eventos_tec.domain.model.address.Address;
import br.com.api.eventos_tec.domain.model.event.Event;
import br.com.api.eventos_tec.repositories.AddressRepository;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address createAddress(EventRequestDTO data, Event event) {

        Address address = new Address();

        address.setCity(data.city());
        address.setCity(data.city());
        address.setUf(data.state());
        address.setEvent(event);

        return addressRepository.save(address);

    }

}
