package com.ieee.jpa.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class TelephoneResponseDto {
    private Long id;
    private String number;
    private String operator;
    private String status;

}
