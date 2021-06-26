package com.ieee.jpa.service;

import com.ieee.jpa.dto.TelephoneRequestDto;
import com.ieee.jpa.dto.TelephoneResponseDto;
import com.ieee.jpa.repository.TelephoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TelephoneServiceImpl implements TelephoneService {
    private final TelephoneRepository telephoneRepository;

    @Override
    public TelephoneResponseDto saveTelephone(TelephoneRequestDto telephoneRequestDto) {
        throw new NullPointerException();
    }

    @Override
    public TelephoneResponseDto getTelephoneById(Long id) {
        return null;
    }

    @Override
    public List<TelephoneResponseDto> getAllTelephone() {
        return null;
    }

    @Override
    public List<TelephoneResponseDto> getTelephoneByPerson(Long idPerson) {
        return null;
    }
}
