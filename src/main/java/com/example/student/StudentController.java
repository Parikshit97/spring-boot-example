package com.example.student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private final StudentService studentService;

    /*
        This is not going to work as we don;t have an instance of StudentService
     */
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    public List<Student> getStudent(){
        return studentService.getStudent();
    }

}
