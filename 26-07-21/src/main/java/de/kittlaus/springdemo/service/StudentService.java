package de.kittlaus.springdemo.service;


import de.kittlaus.springdemo.objects.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student("Franz","1"),
                new Student("Anna","2")
        );
    }

}
