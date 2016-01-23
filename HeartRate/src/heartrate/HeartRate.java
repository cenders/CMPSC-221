package heartrate;

import java.util.Scanner;

/**
 * CMPSC 221 Program #2
 * HeartRate.java
 * Purpose: Calculate heart rate data from user-supplied data
 * 
 * @author Collin Enders
 */
public class HeartRate {
    
    public static void main(String[] args) {
        
        String firstName, lastName; // String variables for first and last names
        int birthYear, birthMonth, birthDay; // Int variables for storing birthdate
        
        Scanner input = new Scanner(System.in); // Create scanner object
        
        System.out.println("Welcome to the Target-Heart-Rate Calculator!"); // Greet user
        System.out.println("Please input the following information:"); // Prompt for info
        System.out.print("First name: "); // Prompt for first name
        firstName = input.nextLine(); // Assign first name
        
        System.out.print("Last name: "); // Prompt for last name
        lastName = input.nextLine(); // Assign last name
        
        System.out.print("Birth day: "); // Prompt for birth day
        birthDay = input.nextInt(); // Assign birth day
        
        System.out.print("Birth month: "); // Prompt for birth month
        birthMonth = input.nextInt(); // Assign birth month
        
        System.out.print("Birth year: "); // Prompt for birth year
        birthYear = input.nextInt(); // Asssign birth year
        
        HeartRates collin = new HeartRates(firstName, lastName, birthDay, birthMonth, birthYear); // Create HeartRates object with user-supplied information
        
        System.out.print("\n\n");
        collin.print(); // Print out results
    }
    // End of program
}
