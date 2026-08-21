package com.example.studentmanagement.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GradeInputDTO {
    private Long studentId;
    private Long teacherId;
    private Double score;
    private String remarks;
    private Boolean overridePromotion;
}
