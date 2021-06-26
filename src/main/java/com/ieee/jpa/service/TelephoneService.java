package com.ieee.jpa.service;

import com.ieee.jpa.dto.TelephoneRequestDto;
import com.ieee.jpa.dto.TelephoneResponseDto;

import java.util.List;

public interface TelephoneService {
    TelephoneResponseDto saveTelephone(TelephoneRequestDto telephoneRequestDto);

    TelephoneResponseDto getTelephoneById(Long id);

    List<TelephoneResponseDto> getAllTelephone();

    List<TelephoneResponseDto> getTelephoneByPerson(Long idPerson);
}
