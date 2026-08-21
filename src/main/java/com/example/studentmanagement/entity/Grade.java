package com.example.studentmanagement.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@Entity
@Table(name = "grades")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @OneToMany
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;
    private Double score;
    private Boolean isPassed;
    private Boolean isPromoted;
    private String remarks;
}
