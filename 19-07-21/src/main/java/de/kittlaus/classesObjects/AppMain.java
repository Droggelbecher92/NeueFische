package de.kittlaus.classesObjects;

import de.kittlaus.model.Student;

public class AppMain {
    public static void main(String[] args) {
        Student myFirstStudent = new Student("Klausi","Peter",23);
        myFirstStudent.setFirstName("Klaus");
        System.out.println(myFirstStudent.getFirstName());
        System.out.println(myFirstStudent.getMatriculationNumber());
        System.out.println(Integer.MAX_VALUE);

        Student test = new Student("Klaus","Peter",23);
        System.out.println(test.toString());

        System.out.println(test.equals(myFirstStudent));
    }
}
