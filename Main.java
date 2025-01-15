/*
 * Exercise 1/2
 * Author: Joshua Leslie
 * Student Number: W0228010
 * Last Updated: 01/15/2025
 */

public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student(); // Creating an object of Student class
        student1.setName("Josh Leslie"); // Setting the name of the student
        student1.setStudentID(123456); // Setting the student ID
        student1.setProgram("Computer Science"); // Setting the program
        
        System.out.println("Student Name: " + student1.getName()); // Getting the name of the student
        System.out.println("Student ID: " + student1.getStudentID()); // Getting the student ID
        System.out.println("Program: " + student1.getProgram()); // Getting the program
        System.out.println("===================================="); // Seperator so output doesn't run altogether, for decorarion purposes only

        Student student2 = new Student(); // Creating another object of Student class
        student2.setName("Prince Vegeta"); // Setting the name of the student
        student2.setStudentID(789012); // Setting the student ID
        student2.setProgram("Physics"); // Setting the program

        System.out.println("Student Name: " + student2.getName()); // Getting the name of the student
        System.out.println("Student ID: " + student2.getStudentID()); // Getting the student ID
        System.out.println("Program: " + student2.getProgram()); // Getting the program
        System.out.println("===================================="); // Seperator so output doesn't run altogether, for decorarion purposes only

        Student student3 = new Student(); // Creating another object of Student class
        student3.setName("King Kai"); // Setting the name of the student
        student3.setStudentID(345678); // Setting the student ID
        student3.setProgram("Astronomy"); // Setting the program

        System.out.println("Student Name: " + student3.getName()); // Getting the name of the student
        System.out.println("Student ID: " + student3.getStudentID()); // Getting the student ID
        System.out.println("Program: " + student3.getProgram()); // Getting the program
    }
}
