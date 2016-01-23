package bmicalculator;
import java.util.Scanner; //Import Scanner class

/**
 * CMPSC 221 Program #1
 * BMICalculator.java
 * Purpose: Calculate BMI from user-supplied data
 * 
 * @author Collin Enders
 */
public class BMICalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Input object
        int weight; // Stores weight of person
        int height; // Stores height of person
        
        System.out.println("Welcome to the Body Mass Index Calculator!");
        System.out.println("Please enter your weight and height.");
        
        System.out.print("Weight: ");
        weight = input.nextInt(); // Input weight and assign to variable
        
        System.out.print("Height: ");
        height = input.nextInt(); // Input height and assign to variable
        
        int bmi = (weight * 703)/(height * height); // Calculate BMI and assign to variable
        
        System.out.println("\nYou have a BMI of " + bmi + ".\n"); // Output calculated BMI
        
        System.out.println("Here is a list of BMI Values:"); // Display BMI chart
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
    }
    
}
