package com.ieee.jpa.service;

import com.ieee.jpa.domain.Person;
import com.ieee.jpa.dto.PersonRequestDto;
import com.ieee.jpa.dto.PersonResponseDto;
import com.ieee.jpa.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    @Transactional
    public PersonResponseDto savePerson(PersonRequestDto personRequestDto) {
        Person person = new Person();
        person.setFirstName(personRequestDto.getFirstName());
        person.setLastName(personRequestDto.getLastName());
        person.setStatus("1");
        this.personRepository.saveAndFlush(person);

        PersonResponseDto responseDto = PersonResponseDto.builder()
                .id(person.getId())
                .firstName(person.getFirstName())
                .lastName(person.getLastName())
                .status(person.getStatus())
                .build();
        return responseDto;
    }

    @Override
    public PersonResponseDto getPersonById(Long id) {
        Person person = this.personRepository.findById(id).orElse(null);
        if (person != null) {
            return PersonResponseDto.builder()
                    .id(person.getId())
                    .firstName(person.getFirstName())
                    .lastName(person.getLastName())
                    .status(person.getStatus())
                    .build();
        }
        return null;
    }

    @Override
    public List<PersonResponseDto> getAllPerson() {
        return null;
    }
}
