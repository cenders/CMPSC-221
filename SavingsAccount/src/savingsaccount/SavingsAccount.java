/**
 *
 * CMPSC 221 Program #7
 * SavingsAccount.java
 * Purpose: Create accounts and apply monthly interest to them
 * 
 * @author Collin Enders
 */

package savingsaccount;

public class SavingsAccount {

    public static void main(String[] args) {
        
        Savings saver1 = new Savings(2000.00); // Create account with $2000 balance
        Savings saver2 = new Savings(3000.00); // Create account with $3000 balance
        
        // Modify interest rate to 4%
        Savings.modifyInterestRate(.04);
        
        // Calculate interest for 12 months with both accounts
        saver1.calculateYearlyInterest();
        saver2.calculateYearlyInterest();
        
        // Print out balance after 12 months for both accounts
        System.out.println("Saver #1 has $" + saver1.getSavingsBalance() + " after one year");
        System.out.println("Saver #2 has $" + saver2.getSavingsBalance() + " after one year");
        
        // Modify interest rate to 5%
        Savings.modifyInterestRate(.05);
        
        // Calculate interest for 1 month with both accounts
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        
        // Print out balance after 13 months for both accounts
        System.out.println("Saver #1 has $" + saver1.getSavingsBalance() + " after thirteen months");
        System.out.println("Saver #2 has $" + saver2.getSavingsBalance() + " after thirteen months");
        
    }
    
}
