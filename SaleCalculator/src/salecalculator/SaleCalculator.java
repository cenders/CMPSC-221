package salecalculator;

/**
 * 
 * CMPSC 221 Program #4
 * SaleCalculator.java
 * Purpose: Let customer pick out products to buy and list total price
 * 
 * @author Collin Enders
 */
public class SaleCalculator {

    public static void main(String[] args) {
        Sale customer = new Sale(); // Declare new sale object
        
        customer.listPrices(); // List prices of each product
        customer.doSales(); // Let customer buy products
        
        System.out.print("Your total is: "); 
        System.out.format("%.2f", customer.getTotalCost());// Print out total cost of products
    }
    
}
