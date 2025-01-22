/*
 * Exercise 1/2/3
 * Author: Joshua Leslie
 * Student Number: W0228010
 * Last Updated: 01/22/2025
 */

public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student(); // Creating an object of Student class
        student1.setName("Josh Leslie"); // Setting the name of the student
        student1.setStudentID(123456); // Setting the student ID
        student1.setProgram("Computer Science"); // Setting the program

        /* Removing the commented out code below, as the display method in Student.java is used to display the student information
        System.out.println("Student Name: " + student1.getName()); // Getting the name of the student
        System.out.println("Student ID: " + student1.getStudentID()); // Getting the student ID
        System.out.println("Program: " + student1.getProgram()); // Getting the program
        System.out.println("===================================="); // Seperator so output doesn't run altogether, for decoration purposes only
        */

        Student student2 = new Student(); // Creating another object of Student class
        student2.setName("Prince Vegeta"); // Setting the name of the student
        student2.setStudentID(789012); // Setting the student ID
        student2.setProgram("Physics"); // Setting the program

        /* Removing the commented out code below, as the display method in Student.java is used to display the student information
        System.out.println("Student Name: " + student2.getName()); // Getting the name of the student
        System.out.println("Student ID: " + student2.getStudentID()); // Getting the student ID
        System.out.println("Program: " + student2.getProgram()); // Getting the program
        System.out.println("===================================="); // Seperator so output doesn't run altogether, for decoration purposes only
        */

        Student student3 = new Student(); // Creating another object of Student class
        student3.setName("King Kai"); // Setting the name of the student
        student3.setStudentID(345678); // Setting the student ID
        student3.setProgram("Astronomy"); // Setting the program
        System.out.println("===================================="); // Seperator so output doesn't run altogether, for decoration purposes only

        /* Removing the commented out code below, as the display method in Student.java is used to display the student information 
        System.out.println("Student Name: " + student3.getName()); // Getting the name of the student
        System.out.println("Student ID: " + student3.getStudentID()); // Getting the student ID
        System.out.println("Program: " + student3.getProgram()); // Getting the program
        */

        Student student4 = new Student(); // Creating another object of Student class
        Student student5 = new Student("Goku"); // Creating another object of Student class with a name parameter
        Student student6 = new Student("Gohan", 987654); // Creating another object of Student class with a name and student ID parameter
        Student student7 = new Student("Piccolo", 654321, "Martial Arts"); // Creating another object of Student class with a name, student ID, and program parameter

        student1.display(); // Displaying the student information for student1 using the display method
        student2.display(); // Displaying the student information for student2 using the display method
        student3.display(); // Displaying the student information for student3 using the display method
        student4.display(); // Displaying the student information for student4 using the display method, showing default parameters from constructor defaults
        student5.display(); // Displaying the student information for student5 using the display method, showing the name parameter passed in the constructor
        student6.display(); // Displaying the student information for student6 using the display method, showing the name and student ID parameter passed in the constructor
        student7.display(); // Displaying the student information for student7 using the display method, showing the name, student ID, and program parameter passed in the constructor

    }
}
