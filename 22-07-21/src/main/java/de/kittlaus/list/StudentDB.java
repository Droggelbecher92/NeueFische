package de.kittlaus.list;

import java.util.*;

public class StudentDB {

    private Map<Integer,Student> students = new HashMap<>();

    public StudentDB(Student[] students) {
        HashMap<Integer,Student> studentHashMap = new HashMap<Integer,Student>();
        for (int i = 0; i < students.length; i++) {
            studentHashMap.put(students[i].getId(),students[i]);
        }
        this.students=studentHashMap;
    }

    public StudentDB(List<Student> students) {
        HashMap<Integer,Student> studentHashMap = new HashMap<Integer,Student>();
        for (int i = 0; i < students.size(); i++) {
            studentHashMap.put(students.get(i).getId(),students.get(i));
        }
        this.students=studentHashMap;
    }

    public StudentDB(HashMap<Integer,Student> students) {
        this.students.putAll(students);
    }

    public StudentDB(Map<Integer,Student> students) {
        this.students.putAll(students);
    }

    public Map<Integer,Student> map() {
        return this.students;
    }

    @Override
    public String toString(){
        return this.students.toString();
    }


    public Student getRandomStudent() {
        int maxStudentArrayIndex = this.students.size();
        if (maxStudentArrayIndex > 0) {
            int randomIndex = (int)(Math.random()*(maxStudentArrayIndex));
            return this.students.get(randomIndex+1);
        }
        return null;
    }

    public void add(Student student) {
        students.put(student.getId(),student);
    }

    public void remove(Student studentToRemove) {
        this.students.remove(studentToRemove.getId());
    }

    private int countStudents() {
        return students.size();
    }
}
