package airlinereservations;

import java.util.Scanner;

/**
 * CMPSC 221 Program #6
 * AirlineReservations.java
 * Purpose: Allow customers to reserve seats on a flight
 * 
 * @author Collin Enders
 */
public class AirlineReservations {
    public static void main(String[] args) {
        Flight flight = new Flight(); // Create Flight object
        Scanner input = new Scanner(System.in); // Create Scanner object for input
        
        // Print greeting and ask for input
        System.out.println("Welcome! What class seat would you like for your flight?");
        System.out.print("Please enter 1 for first-class or 2 for economy seating: ");
        
        //Assign seat according to input
        flight.assignSeat(input.nextInt());
        
        //Print user's ticket
        flight.printTicket();
    }
}
