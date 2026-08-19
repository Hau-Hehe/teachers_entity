package com.example.studentmanagement.mapper;

import com.example.studentmanagement.dto.StudentDTO;
import com.example.studentmanagement.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public StudentDTO toDTO(Student student) {
        if(student == null) return null;
        return StudentDTO.builder()
                .id(student.getId())
                .firstName(student.getFirstName())
                .lastName(student.getLastName())
                .email(student.getEmail())
                .age(student.getAge())
                .build();
    }

    public Student toEntity(StudentDTO studentDTO) {
        if(studentDTO == null) return null;
        return Student.builder()
                .id(studentDTO.getId())
                .firstName(studentDTO.getFirstName())
                .lastName(studentDTO.getLastName())
                .email(studentDTO.getEmail())
                .age(studentDTO.getAge())
                .build();
    }
}
