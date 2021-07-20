package de.kittlaus.module;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {


    @Test
    public void testGetStudentlist(){
        //GIVEN
        Student student1 = new Student("Klaus","Peter", 111);
        Student student2 = new Student("Anna","Mayer",112);
        Student student3 = new Student("Kim","Hillers",113);
        Student[] testArray = {student1,student2,student3};
        StudentDB testDB = new StudentDB(testArray);

        Student[] expected = {student1,student2,student3};
        //WHEN
        Student[] actual = testDB.list();
        //THEN
        assertArrayEquals(expected,actual);
    }

    @Test
    public void testGetStudentlistAsString(){
        //GIVEN
        Student student1 = new Student("Klaus","Peter", 111);
        Student student2 = new Student("Anna","Mayer",112);
        Student student3 = new Student("Kim","Hillers",113);
        Student[] testArray = {student1,student2,student3};
        StudentDB testDB = new StudentDB(testArray);

        String expected = "Name: Klaus Peter , ID:111 / Name: Anna Mayer , ID:112 / Name: Kim Hillers , ID:113 / ";
        //WHEN
        String actual = testDB.toString();
        //THEN
        assertEquals(expected,actual);
    }

    @Test
    public void testAddStudentToDB(){
        //GIVEN
        Student student1 = new Student("Klaus","Peter", 111);
        Student student2 = new Student("Anna","Mayer",112);
        Student student3 = new Student("Kim","Hillers",113);
        Student[] testArray = {student1,student2};
        StudentDB testDB = new StudentDB(testArray);

        Student[] expected = {student1,student2,student3};
        //WHEN
        testDB.addStudent(student3);
        Student[] actual = testDB.list();
        //THEN
        assertArrayEquals(expected,actual);
    }

    @Test
    public void testRemoveStudentFromDBwithValidID(){
        //GIVEN
        Student student1 = new Student("Klaus","Peter", 111);
        Student student2 = new Student("Anna","Mayer",112);
        Student student3 = new Student("Kim","Hillers",113);
        Student[] testArray = {student1,student2,student3};
        StudentDB testDB = new StudentDB(testArray);

        Student[] expected = {student1,student2};
        //WHEN
        testDB.removeStudent(113);
        Student[] actual = testDB.list();
        //THEN
        assertArrayEquals(expected,actual);
    }

    @Test
    public void testRemoveStudentFromDBwithInvalidID(){
        //GIVEN
        Student student1 = new Student("Klaus","Peter", 111);
        Student student2 = new Student("Anna","Mayer",112);
        Student student3 = new Student("Kim","Hillers",113);
        Student[] testArray = {student1,student2,student3};
        StudentDB testDB = new StudentDB(testArray);

        Student[] expected = {student1,student2,student3};
        //WHEN
        testDB.removeStudent(114);
        Student[] actual = testDB.list();
        //THEN
        assertArrayEquals(expected,actual);
    }

    @Test
    public void testAddStudentToDBWithArray(){
        //GIVEN
        Student student1 = new Student("Klaus","Peter", 111);
        Student student2 = new Student("Anna","Mayer",112);
        Student student3 = new Student("Kim","Hillers",113);
        Student[] testArray = {student1,student2,student3};
        Student[] init = {};
        StudentDB testDB = new StudentDB(init);

        Student[] expected = {student1,student2,student3};
        //WHEN
        testDB.addArrayOfNewStudents(testArray);
        Student[] actual = testDB.list();
        //THEN
        assertArrayEquals(expected,actual);
    }

    public void testRemoveMultipleStudentFromDBwithSomeValidIDs(){
        //GIVEN
        Student student1 = new Student("Klaus","Peter", 111);
        Student student2 = new Student("Anna","Mayer",112);
        Student student3 = new Student("Kim","Hillers",113);
        Student student4 = new Student("Hans","Müller",114);
        Student[] testArray = {student1,student2,student3,student4};
        StudentDB testDB = new StudentDB(testArray);
        int[] studentsToRemove = {112,114,116};

        Student[] expected = {student1,student3};
        //WHEN
        testDB.removeMultipleStudent(studentsToRemove);
        Student[] actual = testDB.list();
        //THEN
        assertArrayEquals(expected,actual);
    }

    public void testRemoveMultipleStudentFromDBwithOnlyValidIDs(){
        //GIVEN
        Student student1 = new Student("Klaus","Peter", 111);
        Student student2 = new Student("Anna","Mayer",112);
        Student student3 = new Student("Kim","Hillers",113);
        Student student4 = new Student("Hans","Müller",114);
        Student[] testArray = {student1,student2,student3,student4};
        StudentDB testDB = new StudentDB(testArray);
        int[] studentsToRemove = {112,114,111};

        Student[] expected = {student3};
        //WHEN
        testDB.removeMultipleStudent(studentsToRemove);
        Student[] actual = testDB.list();
        //THEN
        assertArrayEquals(expected,actual);
    }

    public void testRemoveMultipleStudentFromDBwithNoValidIDs(){
        //GIVEN
        Student student1 = new Student("Klaus","Peter", 111);
        Student student2 = new Student("Anna","Mayer",112);
        Student student3 = new Student("Kim","Hillers",113);
        Student student4 = new Student("Hans","Müller",114);
        Student[] testArray = {student1,student2,student3,student4};
        StudentDB testDB = new StudentDB(testArray);
        int[] studentsToRemove = {11,1,116};

        Student[] expected = {student1,student2,student3,student4};
        //WHEN
        testDB.removeMultipleStudent(studentsToRemove);
        Student[] actual = testDB.list();
        //THEN
        assertArrayEquals(expected,actual);
    }

}