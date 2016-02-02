package airlinereservations;

import java.util.Scanner;

/**
 * CMPSC 221 Program #6
 * Flight.java
 * Purpose: Methods used to reserve a seat on a flight
 * 
 * @author Collin Enders
 */
public class Flight {
    Scanner input = new Scanner(System.in); // Create Scanner object for input
    private boolean[] seats = new boolean[10]; // Create 10 seats (false)
    private int seatNumber; // Stores assigned seat number
    private String section; // Stores assigned section
    
    
    // Assigns seat in section of user's selection.
    // If no seat in that section is available then offer them a seat in
    // A different section.
    void assignSeat(int opt){
        boolean found = false; // Boolean to check if a seat was found
        if(opt == 1){ // If user wants first-class seating
            for(int i = 0; i < 5; i++){ // Check first 5 seats
                if(seats[i] == false){ // If seat is currently unassigned
                    seats[i] = true; // Mark seat as assigned
                    seatNumber = i + 1;
                    section = "First-class";
                    found = true;                
                    break;
                }
            }
            if(found == false){ // If a seat was not found in that section
                System.out.println("Sorry, but the first-class section is full.");
                System.out.print("Would you like to be placed in economy seating? (y/n): ");
                if(input.next() == "y"){
                    assignSeat(2); // Assign seat in other section
                }
                else{
                    System.out.println("Next flight leaves in 3 hours");
                }
            }
        }
        else{ // If user wants economy seating
            for(int i = 5; i < 10; i++){  // Check seats 6-10
                if(seats[i] == false){ // If seat is currently unassigned
                    seats[i] = true; // Mark seat as assigned
                    seatNumber = i + 1;
                    section = "Economy";
                    found = true;
                    break;
                }
            }
            if(found == false){ // If a seat was not found in that section
                System.out.println("Sorry, but the economy section is full.");
                System.out.print("Would you like to be placed in first-class seating? (y/n): ");
                if(input.next() == "y"){
                    assignSeat(1); // Assign seat in other section
                }
                else{
                    System.out.println("Next flight leaves in 3 hours");
                }
            }
        }
    }
    
    // Print out user's ticket
    void printTicket(){
        System.out.println("Here is your ticket:");
        System.out.println("|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
        System.out.println("|************* Seat Number: " + seatNumber + " ******************|");
        System.out.println("|************* Section:" + section + " *****************|");
        System.out.println("|_______________________________________________|");
    }
}
