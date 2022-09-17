package com.example.mycode.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "amo/api/student")
public class StudentController {

    public final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "/showStudent")
    public List<Student> getStudent(){

        return studentService.showStudent();
    }

    @PostMapping(path = "/addStudent")
    public  String addStudent(@RequestBody Student student){

        studentService.addStudent(student);

        return "Student saved";
    }

}
