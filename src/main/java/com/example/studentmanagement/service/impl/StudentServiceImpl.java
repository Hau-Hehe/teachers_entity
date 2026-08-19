package com.example.studentmanagement.service.impl;

import com.example.studentmanagement.dto.StudentDTO;
import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.exception.ResourceException;
import com.example.studentmanagement.mapper.StudentMapper;
import com.example.studentmanagement.repository.StudentRepository;
import com.example.studentmanagement.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentMapper studentMapper;
    private final StudentRepository studentRepository;

    @Override
    public StudentDTO createStudent(StudentDTO studentDTO) {
        Student student = studentMapper.toEntity(studentDTO);
        Student savedStudent = studentRepository.save(student);
        return studentMapper.toDTO(savedStudent);
    }

    @Override
    public StudentDTO getStudentById(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceException("Student is not found by this id: " + id));
        return studentMapper.toDTO(student);
    }

    @Override
    public List<StudentDTO> getAllStudent() {
        return studentRepository.findAll()
                .stream()
                .map(student -> studentMapper.toDTO(student))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTO updateStudent(Long id, StudentDTO studentDTO) {
        Student existingStudent = studentRepository.findById(id)
                .orElseThrow(()-> new ResourceException("Student is not found by this id: " + id));

        existingStudent.setFirstName(studentDTO.getFirstName());
        existingStudent.setLastName(studentDTO.getLastName());
        existingStudent.setEmail(studentDTO.getEmail());
        existingStudent.setAge(studentDTO.getAge());

        Student updateStudent = studentRepository.save(existingStudent);
        return studentMapper.toDTO(updateStudent);
    }

    @Override
    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceException("Student is not found by this id: " + id));
        studentRepository.delete(student);
    }
}
