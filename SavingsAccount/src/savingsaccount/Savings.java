/**
 *
 * CMPSC 221 Program #7
 * Savings.java
 * Purpose: Contains methods to create accounts and apply monthly interest to them
 * 
 * @author Collin Enders
 */

package savingsaccount;

public class Savings {
    
    private static double annualInterestRate = 0; // Stores annual interest rate
    private double savingsBalance = 0; // Stores current balance of the account
    
    // Constructor that takes the starting balance of the account as a parameter
    public Savings(double startingBalance){
        savingsBalance = startingBalance;
    }
    
    // Returns the current balance of the account
    public double getSavingsBalance(){
        return savingsBalance;
    }
    
    // Static method to modify the current interest rate
    public static void modifyInterestRate(double rate){
        annualInterestRate = rate;
    }
    
    // Method to calculate interest for the month
    public void calculateMonthlyInterest(){
        savingsBalance = savingsBalance + savingsBalance * (annualInterestRate / 12);
    }
    
    // Method to calculate interest for the year
    public void calculateYearlyInterest(){
        savingsBalance = savingsBalance + savingsBalance * annualInterestRate;
    }
    
}
