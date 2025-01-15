/*
 * Exercise 1/2
 * Author: Joshua Leslie
 * Student Number: W0228010
 * Last Updated: 01/15/2025
 */

public class Student {
    
    private String name; // Declaring the name of the student
    private String program; // Declaring the program of the student
    private int studentID; // Declaring the student ID


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
}