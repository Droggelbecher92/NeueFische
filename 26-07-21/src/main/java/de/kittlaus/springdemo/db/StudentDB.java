package de.kittlaus.springdemo.db;

import de.kittlaus.springdemo.objects.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDB {

    List<Student> studentList = new ArrayList<Student>();

    public StudentDB(List<Student> studentList) {
        studentList.add(new Student("Franz",1));
        studentList.add(new Student("Paul",2));
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentList=" + studentList +
                '}';
    }
}
