package tripcalculator;

import java.util.Scanner;

/**
 * CMPSC 221 Program #3
 * TripCalculator.java
 * Purpose: Calculate mileage from user-supplied data
 * 
 * @author Collin Enders
 */
public class TripCalculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // Create scanner object
        int totalMiles = 0, totalGallons = 0, numberOfTrips = 0; // Initialize totalMiles, totalGallons, and numberOfTrips to 0
        
        System.out.println("Welcome to the Trip Calculator!"); // Greet user
        System.out.print("How many trips did you take? "); // Prompt for number of trips
        
        numberOfTrips = input.nextInt(); // Assign input to numberOfTrips
        
        int[] miles = new int[numberOfTrips]; // Integer array used to store miles traveled in a trip
        int[] gallons = new int[numberOfTrips]; // Integer array used to store gallons of fuel used in a trip
        
        for( int i = 0; i < numberOfTrips; i++){ // Loop through for each trip
            System.out.println("\nTrip #" + (i+1)); // Output trip number
            
            System.out.print("Miles traveled: "); // Prompt for number of miles traveled
            miles[i] = input.nextInt(); // Assign input to the current trip in the miles array
            
            System.out.print("Gallons used: "); // Prompt for number of gallons of fuel used 
            gallons[i] = input.nextInt(); // Assign input to the current trip in the gallons array
            
            System.out.println("MPG: " + miles[i]/gallons[i]); // Output total miles per gallon (MPG) for the trip
        }
        
        for( int i = 0; i < numberOfTrips; i++){ // Loop through for each trip
            totalMiles = miles[i] + totalMiles; // Add together all miles traveled
            totalGallons = gallons[i] + totalGallons; // Add together all gallons of fuel used
        }
        
        System.out.println("\nTotal miles traveled: " + totalMiles); // Print out total amount of miles traveled
        System.out.println("Total gallons used: " + totalGallons); // Print out total gallons of fuel used
        System.out.println("Total MPG: " + totalMiles/totalGallons); // Print out total Miles Per Gallon (MPG)
    }
    
}
