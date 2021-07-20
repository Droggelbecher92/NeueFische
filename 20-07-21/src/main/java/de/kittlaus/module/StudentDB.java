package de.kittlaus.module;

import java.util.Arrays;

public class StudentDB {
        private Student[] studentList;

        public StudentDB(Student[] studentList) {
                this.studentList = studentList;
        }

        @Override
        public String toString() {
                String studentListAsString = "";
                for (int i = 0; i < studentList.length; i++) {
                        studentListAsString += studentList[i].toString();
                }
                return studentListAsString;
        }

        public Student[] list(){
                return studentList;
        }

        public Student randomStudentFromDB(){
                int randomIndex = (int)Math.random()* studentList.length;
                return studentList[randomIndex];
        }

        public void addStudent(Student newStudentToAdd) {
                if (!isIDinDB(newStudentToAdd.getId())) {
                        Student[] newStudentList = new Student[studentList.length + 1];
                        for (int i = 0; i < studentList.length; i++) {
                                newStudentList[i] = studentList[i];
                        }
                        newStudentList[studentList.length] = newStudentToAdd;
                        studentList = newStudentList;
                }
        }

        public void removeStudent(int whichID) {
                if (isIDinDB(whichID)) {
                        int indexTick = 0;
                        Student[] newStudentList = new Student[studentList.length - 1];
                        for (int i = 0; i < studentList.length; i++) {
                                if (studentList[i].getId() != whichID) {
                                        newStudentList[indexTick] = studentList[i];
                                        indexTick++;
                                }
                        }
                        studentList = newStudentList;
                }
        }

        private boolean isIDinDB(int whichID) {
                for (int i = 0; i < studentList.length; i++) {
                     if (studentList[i].getId()==whichID){
                             return true;
                     }
                }
                return false;
        }

        public void addArrayOfNewStudents(Student[] arrayOfNewStudents){
                for (int i = 0; i < arrayOfNewStudents.length; i++) {
                        addStudent(arrayOfNewStudents[i]);
                }
        }

        public void removeMultipleStudent(int[] studentsToRemove) {
                for (int i = 0; i < studentsToRemove.length; i++) {
                        removeStudent(studentsToRemove[i]);
                }
        }
}
