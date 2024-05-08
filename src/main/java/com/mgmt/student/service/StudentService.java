package com.mgmt.student.service;

import com.mgmt.student.model.Student;

import java.util.List;

public interface StudentService {

    Student addStudent(Student student);

    Student getStudentById(Long id);

    List<Student> getStudentsByName(String name);

    List<Student> getStudentsByClass(String className);

    Student updateStudent(Long id, Student updatedStudent);
}
