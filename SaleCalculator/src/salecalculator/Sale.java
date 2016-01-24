package salecalculator;

import java.util.Scanner;

/**
 *
 * CMPSC 221 Program #4
 * Sale.java
 * Purpose: Contains methods to perform sales
 * 
 * @author Collin Enders
 */
public class Sale {
    
    
    
    Scanner input = new Scanner(System.in); // Declare scanner object
    
    public final int EXIT_VALUE = -999; // Delimiter value
    private int in; // Input variable
    private double totalCost = 0.0; // Variable to store total cost
    
    double getTotalCost(){ // Get function for the total cost
        return totalCost;
    }
    
    void listPrices(){ // Print out prices
        System.out.println("Here's a list of prices:");
        System.out.println("Product 1: $2.98");
        System.out.println("Product 2: $4.50");
        System.out.println("Product 3: $9.98");
        System.out.println("Product 4: $4.49");
        System.out.println("Product 5: $6.87");
    }
    
    void doSales(){ // Perform all sales
        while (in != EXIT_VALUE){ // Perform this while the delimiter value is not input
            System.out.print("Please enter a product to buy: ");
            in = input.nextInt();
            switch(in){ // Start switch for products to buy
                case 1: // Product #1
                    System.out.print("Quantity: ");
                    in = input.nextInt();
                    totalCost = totalCost + 2.98 * in; // Add 2.98 to total cost
                    break;
                case 2: // Product #2
                    System.out.print("Quantity: ");
                    in = input.nextInt();
                    totalCost = totalCost + 4.50 * in; // Add 4.50 to total cost
                    break;
                case 3: // Product #3
                    System.out.print("Quantity: ");
                    in = input.nextInt();
                    totalCost = totalCost + 9.98 * in; // Add 9.98 to total cost
                    break;
                case 4: // Product #4
                    System.out.print("Quantity: ");
                    in = input.nextInt();
                    totalCost = totalCost + 4.49 * in; // Add 4.49 to total cost
                    break;
                case 5: // Product #5
                    System.out.print("Quantity: ");
                    in = input.nextInt();
                    totalCost = totalCost + 6.87 * in; // Add 6.87 to total cost
                    break;
                case EXIT_VALUE: // If delimiter value is used
                    break;
                default: // In case a product or delimiter is not used
                    System.out.println("Please enter a valid product number or -999 to stop shopping");
                    break;
            }
        }
    }
}
