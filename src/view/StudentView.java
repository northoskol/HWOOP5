package view;

import Data.Student;

public class StudentView {
    public void displayStudent(Student student) {
        System.out.println("Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("ID: " + student.getId());
    }
}
