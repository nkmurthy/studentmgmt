package com.mgmt.student.service.impl;

import com.mgmt.student.model.Student;
import com.mgmt.student.repository.StudentRepository;
import com.mgmt.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> getStudentsByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public List<Student> getStudentsByClass(String className) {
        return studentRepository.findByClassName(className);
    }

    @Override
    public Student updateStudent(Long id, Student updatedStudent) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            student.setName(updatedStudent.getName());
            student.setDateOfBirth(updatedStudent.getDateOfBirth());
            student.setJoiningDate(updatedStudent.getJoiningDate());
            student.setClassName(updatedStudent.getClassName());
            return studentRepository.save(student);
        }
        return null;
    }
}
