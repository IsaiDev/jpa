package com.ieee.jpa.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class TelephoneRequestDto {
    private String number;
    private String operator;
    private Long idPerson;
}
