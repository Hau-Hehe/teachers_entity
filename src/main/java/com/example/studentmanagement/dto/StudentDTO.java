package com.example.studentmanagement.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class StudentDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
}
