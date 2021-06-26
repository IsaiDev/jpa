package com.ieee.jpa.controller;

import com.ieee.jpa.dto.PersonRequestDto;
import com.ieee.jpa.dto.PersonResponseDto;
import com.ieee.jpa.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public PersonResponseDto savePerson(@RequestBody PersonRequestDto personRequestDto) {
        return this.personService.savePerson(personRequestDto);
    }

    @GetMapping("/{id}")
    public PersonResponseDto getById(@PathVariable("id") Long id) {
        return this.personService.getPersonById(id);
    }

}
