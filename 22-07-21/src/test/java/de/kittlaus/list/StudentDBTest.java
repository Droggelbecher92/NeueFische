package de.kittlaus.list;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

class StudentDBTest {

    @Test
    public void testSetupDBWithoutAnyStudents() {
        // GIVEN
        // init db with empty array
        List<Student> students = Collections.emptyList();
        StudentDB studentDB = new StudentDB(students);

        // WHEN
        int actualAmountOfStudents = studentDB.map().size();

        // THEN
        int expectedAMountOfStudentsInDB = 0;
        assertEquals(expectedAMountOfStudentsInDB, actualAmountOfStudents);
    }

    @Test
    public void testSetupDBWithStudentsLength() {
        // GIVEN
        // init db with non empty array
        Student studentKlaus = new Student("Klaus",1);
        Student studentMarie = new Student("Marie",2);
        StudentDB studentDB = new StudentDB(List.of(studentKlaus, studentMarie));

        // WHEN
        int actualAmountOfStudents = studentDB.map().size();

        // THEN
        int expectedAMountOfStudentsInDB = 2;
        assertEquals(expectedAMountOfStudentsInDB, actualAmountOfStudents);
    }

    @Test
    public void testSetupDBWithStudentsEquals() {
        // GIVEN
        StudentDB studentDB = new StudentDB(List.of(new Student("Klaus",1), new Student("Marie",2)));

        // WHEN
        Map<Integer,Student> actualStudents = studentDB.map();

        // THEN
        Map<Integer,Student> expectedStudents = Map.of(1,new Student("Klaus"),2, new Student("Marie"));
        assertEquals(expectedStudents, actualStudents);
    }

    @Test
    public void testStudentDBWithStudentsToString() {
        // GIVEN
        Student studentKlaus = new Student("Klaus",1);
        Student studentMarie = new Student("Marie",2);
        StudentDB studentDB = new StudentDB(Map.of((studentKlaus.getId()),studentKlaus,(studentMarie.getId()),studentMarie));

        // WHEN
        String actualStudentDBString = studentDB.toString();

        // THEN
        String expectedStudentString = "{1=[id=1, name=Klaus], 2=[id=2, name=Marie]}";
        assertEquals(expectedStudentString, actualStudentDBString);
    }

    @Test
    public void testRandomStudent() {
        // GIVEN
        Student studentKlaus = new Student("Klaus",1);
        Student studentMarie = new Student("Marie",2);
        Student studentJohn = new Student("John",3);
        StudentDB studentDB = new StudentDB(Map.of((studentKlaus.getId()),studentKlaus,(studentMarie.getId()),studentMarie,studentJohn.getId(),studentJohn));

        boolean klausSelected = false;
        boolean marieSelected = false;
        boolean johnSelected = false;

        // WHEN
        int maxLoops = 100;

        int i = maxLoops;
        while (!klausSelected || !marieSelected || !johnSelected) {
            Student actualRandomStudent = studentDB.getRandomStudent();

            // THEN
            assertNotNull(actualRandomStudent);
            if (!klausSelected) {
                klausSelected = studentKlaus.equals(actualRandomStudent);
            }
            if (!marieSelected) {
                marieSelected = studentMarie.equals(actualRandomStudent);
            }
            if (!johnSelected) {
                johnSelected = studentJohn.equals(actualRandomStudent);
            }

            --i;

            if (i == 0) {
                fail("Some students not randomly selected within " + maxLoops + " invocations");
            }
        }
    }

    @Test
    public void testAddStudent() {
        // GIVEN
        Student studentKlaus = new Student("Klaus",1);
        Student studentMarie = new Student("Marie",2);
        Student studentJohn = new Student("John",3);
        StudentDB studentDB = new StudentDB(Map.of((studentKlaus.getId()),studentKlaus,(studentMarie.getId()),studentMarie,studentJohn.getId(),studentJohn));

        // WHEN
        Student studentKlara = new Student("Klara",4);
        studentDB.add(studentKlara);
        Map<Integer,Student> actual = studentDB.map();

        // THEN
        Map<Integer,Student> expected = Map.of(studentKlaus.getId(),studentKlaus,studentMarie.getId(), studentMarie,studentJohn.getId(), studentJohn,studentKlara.getId(), studentKlara);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveStudent() {
        // GIVEN
        Student studentKlaus = new Student("Klaus",1);
        Student studentMarie = new Student("Marie",2);
        Student studentJohn = new Student("John",3);
        Student studentKlara = new Student("Klara",4);
        StudentDB studentDB = new StudentDB(Map.of(studentKlaus.getId(),studentKlaus,studentMarie.getId(), studentMarie,studentJohn.getId(), studentJohn,studentKlara.getId(), studentKlara));

        // WHEN
        studentDB.remove(studentMarie);
        Map<Integer,Student> actual = studentDB.map();

        // THEN
        Map<Integer,Student> expected = Map.of(studentKlaus.getId(),studentKlaus,studentJohn.getId(), studentJohn,studentKlara.getId(), studentKlara);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveUnknownStudent() {
        // GIVEN
        Student studentKlaus = new Student("Klaus",1);
        Student studentMarie = new Student("Marie",2);
        Student studentJohn = new Student("John",3);
        Student studentKlara = new Student("Klara",4);
        StudentDB studentDB = new StudentDB(Map.of(studentKlaus.getId(),studentKlaus,studentMarie.getId(), studentMarie,studentJohn.getId(), studentJohn,studentKlara.getId(), studentKlara));

        // WHEN
        Student studentUnknown = new Student("Unknown");
        studentDB.remove(studentUnknown);
        Map<Integer,Student> actual = studentDB.map();

        // THEN
        Map<Integer,Student> expected = Map.of(studentKlaus.getId(),studentKlaus,studentMarie.getId(), studentMarie,studentJohn.getId(), studentJohn,studentKlara.getId(), studentKlara);
        assertEquals(expected, actual);
    }
}