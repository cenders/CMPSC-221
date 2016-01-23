/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salecalculator;

import java.util.Scanner;

/**
 *
 * @author Collin
 */
public class Sale {
    
    Scanner input = new Scanner(System.in);
    final int EXIT_VALUE = -999;
    int in;
    double totalCost = 0.0;
    
    double getTotalCost(){
        return totalCost;
    }
    
    void listPrices(){
        System.out.println("Here's a list of prices:");
        System.out.println("Product 1: $2.98");
        System.out.println("Product 2: $4.50");
        System.out.println("Product 3: $9.98");
        System.out.println("Product 4: $4.49");
        System.out.println("Product 5: $6.87");
    }
    
    void doSales(){
        while (in != EXIT_VALUE){
            System.out.println("Please enter a product to buy:");
            in = input.nextInt();
            switch(in){
                case 1:
                    totalCost = totalCost + 2.98;
                    break;
                case 2:
                    totalCost = totalCost + 4.50;
                    break;
                case 3:
                    totalCost = totalCost + 9.98;
                    break;
                case 4:
                    totalCost = totalCost + 4.49;
                    break;
                case 5:
                    totalCost = totalCost + 6.87;
                    break;
                case EXIT_VALUE:
                    break;
                default:
                    System.out.println("Please enter a valid product number or -999 to stop shopping");
                    break;
            }
        }
    }
}
