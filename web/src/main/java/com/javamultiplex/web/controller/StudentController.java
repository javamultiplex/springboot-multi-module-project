package com.javamultiplex.web.controller;

import com.javamultiplex.db.entity.Student;
import com.javamultiplex.db.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Rohit Agarwal on 23/02/22 11:46 PM
 * @copyright www.javamultiplex.com
 */

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/students")
    public List<Student> get(){
        return studentService.get();
    }

    @PostMapping("/students")
    public void save(@RequestBody List<Student> students){
        studentService.save(students);
    }
}
