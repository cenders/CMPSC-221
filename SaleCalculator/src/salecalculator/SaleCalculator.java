/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salecalculator;

import java.util.Scanner;

/**
 * CMPSC 221 Program #1
 * SaleCalculator.java
 * Purpose: 
 * 
 * @author Collin Enders
 */
public class SaleCalculator {

    public static void main(String[] args) {
        Sale customer = new Sale();
        
        customer.listPrices();
        customer.doSales();
        System.out.println("Your total is: " + customer.getTotalCost());
    }
    
}
