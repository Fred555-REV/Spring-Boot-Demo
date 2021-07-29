package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return this.studentService.getStudents();
    }

    @PutMapping
    public void putStudents(Long id, String name, String email, Integer age, LocalDate dob) {
        this.studentService.putStudents(
                id,
                name,
                email,
                age,
                dob
        );
    }

    @PutMapping(path = "add")
    public void addStudent() {
        this.studentService.addStudent();
    }

    @DeleteMapping
    public void deleteStudents(List<Student> students) {
        this.studentService.deleteStudent(this.getStudents());
    }
}
