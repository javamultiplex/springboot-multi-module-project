package com.javamultiplex.db.service;

import com.javamultiplex.db.entity.Student;
import com.javamultiplex.db.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Rohit Agarwal on 23/02/22 11:31 PM
 * @copyright www.javamultiplex.com
 */
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostConstruct
    public void init(){
        final List<Student> students = List.of(
                new Student("Rohit", "Gurgaon"),
                new Student("Bhavna", "Dehradun"),
                new Student("Shivani", "Rudrapur"));
        save(students);
    }

    public void save(List<Student> students){
        studentRepository.saveAll(students);
    }

    public List<Student> get(){
        return studentRepository.findAll();
    }
}
