package com.example.studentmanagement.service;

import com.example.studentmanagement.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    StudentDTO createStudent(StudentDTO studentDTO);
    StudentDTO getStudentById(Long id);
    List<StudentDTO> getAllStudent();
    StudentDTO updateStudent(Long id, StudentDTO studentDTO);
    void deleteStudent(Long id);
}
