package de.kittlaus.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StudentTest {

    @Test
    public void studentsAreEqualByName() {
        Student first = new Student("Klaus");
        Student second = new Student("Klaus");

        assertEquals(first, second);
    }
}