package com.ieee.jpa.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class PersonResponseDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String status;
}
