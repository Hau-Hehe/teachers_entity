package com.example.studentmanagement.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GradeDTO {
    private Long id;
    private Long studentId;
    private String studentName;
    private Long teacherId;
    private String teacherName;
    private Double score;
    private Boolean isPassed;
    private Boolean isPromoted;
    private String remarks;
}
