package de.kittlaus.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void checkStudentFirstName(){
        //GIVEN
        Student newStudent = new Student("Heinz","Mayer",3);
        //WHEN
        String actual = newStudent.getFirstName();
        //THEN
        assertEquals("Heinz",actual);
    }

    @Test
    public void checkStudentLastName(){
        //GIVEN
        Student newStudent = new Student("Heinz","Mayer",3);
        //WHEN
        String actual = newStudent.getLastName();
        //THEN
        assertEquals("Mayer",actual);
    }

    @Test
    public void checkStudentMatnum(){
        //GIVEN
        Student newStudent = new Student("Heinz","Mayer",3);
        //WHEN
        int actual = newStudent.getMatriculationNumber();
        //THEN
        assertEquals(3,actual);
    }

    @Test
    public void getRightString(){
        //GIVEN
        Student student = new Student("Klaus","Peter",23);
        //WHEN
        String actual = student.toString();
        //THEN
        assertEquals("Der Student Klaus Peter mit der Nummer 23.",actual);
    }


    @ParameterizedTest
    @MethodSource("students")
     public void checkStudentData(String firstName, String lastName, int matNum){
        //GIVEN
        Student student = new Student(firstName,lastName,matNum);
        //WHEN
        String actualFirstName = student.getFirstName();
        String actualLastName = student.getLastName();
        int actualNum = student.getMatriculationNumber();
        //THEN
        assertEquals(firstName,actualFirstName);
        assertEquals(lastName,actualLastName);
        assertEquals(matNum,actualNum);
    }

    private static Arguments[] students (){
        return new Arguments[]{
                Arguments.of("Heinz","Mayer",3),
                Arguments.of("Manzi","Hallo",5),
                Arguments.of("Linda","Anker",8),
                Arguments.of("Klaus","Dksja",34)
        };
    }
}