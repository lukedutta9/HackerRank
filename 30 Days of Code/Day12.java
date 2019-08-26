import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    private int sum;
    private String grade;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    Student(String firstName, String lastName, int identification, int[] testscores) {
        super(firstName, lastName, identification);
        
        this.testScores = testscores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    String calculate() {
        for(int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        sum /= testScores.length;

        if (sum < 40) {
            grade = "T";
        } else if (sum < 55) {
            grade = "D";
        } else if (sum < 70) {
            grade = "P";
        } else if (sum < 80) {
            grade = "A";
        } else if (sum < 90) {
            grade = "E";
        } else if (sum <= 100) {
            grade = "O";
        }
        return grade;
    }

}

class Solution {
