package com.example.demo.student;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private static List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void putStudents(Long id, String name, String email, Integer age, LocalDate dob) {
        students.add(new Student(
                id,
                name,
                email,
                age,
                dob
        ));
    }

    public void addStudent() {
        students.add(new Student(
                1L,
                "Bob",
                "bob.blob@gmail.com",
                20,
                LocalDate.of(2001, Month.JANUARY, 4)
        ));
    }

    public void deleteStudent(List<Student> students) {
        students.remove(0);
    }
}
