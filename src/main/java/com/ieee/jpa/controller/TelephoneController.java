package com.ieee.jpa.controller;

import com.ieee.jpa.dto.TelephoneRequestDto;
import com.ieee.jpa.dto.TelephoneResponseDto;
import com.ieee.jpa.service.TelephoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/telephones")
@RequiredArgsConstructor
public class TelephoneController {
    private final TelephoneService telephoneService;

    @PostMapping
    public TelephoneResponseDto saveTelephone(@RequestBody TelephoneRequestDto telephoneRequestDto) {
        return this.telephoneService.saveTelephone(telephoneRequestDto);
    }
}
