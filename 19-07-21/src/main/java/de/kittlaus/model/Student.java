package de.kittlaus.model;

import java.util.Objects;

public class Student {
    private String firstName = "Paul";
    private String lastName = "Walter";
    private int matriculationNumber = 00;

    public Student(String firstName, String lastName, int matriculationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matriculationNumber = matriculationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(int matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

    public String toString() {
        return "Der Student " + (firstName) + " " + (lastName) + " mit der Nummer " + (matriculationNumber) + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matriculationNumber == student.matriculationNumber
                && Objects.equals(firstName, student.firstName)
                && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, matriculationNumber);
    }
}
