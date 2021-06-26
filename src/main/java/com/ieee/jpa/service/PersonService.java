package com.ieee.jpa.service;

import com.ieee.jpa.dto.PersonRequestDto;
import com.ieee.jpa.dto.PersonResponseDto;

import java.util.List;

public interface PersonService {
    PersonResponseDto savePerson(PersonRequestDto personRequestDto);

    PersonResponseDto getPersonById(Long id);

    List<PersonResponseDto> getAllPerson();
}
