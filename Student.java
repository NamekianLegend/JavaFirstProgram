/*
 * Exercise 1/2/3
 * Author: Joshua Leslie
 * Student Number: W0228010
 * Last Updated: 01/22/2025
 */

public class Student {
    
    private String name; // Declaring the name of the student, private so it can't be accessed directly
    private String program; // Declaring the program of the student, private so it can't be accessed directly
    private int studentID; // Declaring the student ID, private so it can't be accessed directly


    public void setName(String name) {  // Method to set the name of the student
        this.name = name; // Setting the name of the student
    }

    public void setStudentID (int studentID) { // Method to set the student ID
        this.studentID = studentID; // Setting the student ID
    }

    public void setProgram (String program) { // Method to set the program of the student
        this.program = program; // Setting the program of the student
    }
    
    public String getName () { // Method to get the name of the student
        return name; // Returning the name of the student
    }

    public int getStudentID () { // Method to get the student ID
        return studentID; // Returning the student ID
    }

    public String getProgram () { // Method to get the program of the student
        return program; // Returning the program of the student
    }

    public void display() { // Method to display the student information
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentID); 
        System.out.println("Program: " + program); 
        System.out.println("===================================="); 
    }

    public Student() { // Constructor to initialize the student information
        name = "Unknown"; // Setting the name of the student to "Unknown"
        studentID = 0; // Setting the student ID to 0
        program = "Unknown"; // Setting the program of the student to "Unknown"
    }
   
    public Student(String n) { // Constructor to initialize the student information with a name parameter
        name = n; // Setting the name of the student to the name parameter
        studentID = 0; // Setting the student ID to 0
        program = "Unknown"; // Setting the program of the student to "Unknown"
    }

    public Student(String n, int id) { // Constructor to initialize the student information with a name and student ID parameter
        name = n; // Setting the name of the student to the name parameter
        studentID = id; // Setting the student ID to the student ID parameter
        program = "Unknown"; // Setting the program of the student to "Unknown"
    }

    public Student(String n, int id, String p) { // Constructor to initialize the student information with a name, student ID, and program parameter
        this(n, id);
        program = p; // Setting the program of the student to the program parameter
    }
}