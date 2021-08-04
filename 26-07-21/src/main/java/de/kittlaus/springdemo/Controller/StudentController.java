package de.kittlaus.springdemo.Controller;


import de.kittlaus.springdemo.db.StudentDB;
import de.kittlaus.springdemo.objects.Student;
import de.kittlaus.springdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    @GetMapping("/list")
    public List<Student> studentlist() {
        return studentService.getStudents();
    }

    @GetMapping("/string")
    public String studentlistAsString() {
        return (studentService.getStudents().toString());
    }

    @GetMapping("/single")
    public String hello(@RequestParam(value = "id", defaultValue = "1") String id) {
        return studentService.getStudents();
    }
}
