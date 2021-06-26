package com.ieee.jpa.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class PersonRequestDto {
    private String firstName;
    private String lastName;
}
