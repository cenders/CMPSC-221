package computerassistedinstruction;

import java.util.Random;
import java.util.Scanner;

/**
 * CMPSC 221 Program #5
 * MathTest.java
 * Purpose: Methods used to perform math test
 * 
 * @author Collin Enders
 */
public class MathTest {
    
    Random rand = new Random(); // Create new Random object
    Scanner input = new Scanner(System.in); // Create new Scanner object
    private int correct = 0; // Stores number of questions answered correctly
    private int wrong = 0; // Stores number of questions answered wrongly
    
    int randomInt(int max){ // Generates random number from 0 to max
        int generated = rand.nextInt() % max; // Take remainder and assign to generated
        
        if(generated < 0){ // If generated is negative
            return generated * -1; // Return positive generated
        }
        else{
            return generated; // Return positive generated
        }
    }
    
    void askQuestion(int numberOfQuestions){ // Asks numberOfQuestions amount of questions
        for(int i = 0; i < numberOfQuestions; i++){
            int num1 = randomInt(10); // Create random single-digit positive integer
            int num2 = randomInt(10); // Create random single-digit positive integer
            
            System.out.print("How much is " + num1 + " times " + num2 + "? "); // Print out question
            if(input.nextInt() == (num1 * num2)){ // If response is correct
                correct++; // Add 1 to correct
                doResponse(true); // Give a random correct response
            }
            else{
                wrong++; // Add 1 to wrong
                doResponse(false); // Give a random wrong response
            }
        }
    }
    
    void doResponse(boolean answer){ // Prints out a random response whether it is correct or incorrect
        int response = randomInt(4); // Create random integer from 0 to 3
        if(answer == true){ // If the answer is correct
            switch(response){
                case 0:
                    System.out.println("Very good!"); // Print out correct response
                    break;
                case 1:
                    System.out.println("Excellent!"); // Print out correct response
                    break;
                case 2:
                    System.out.println("Nice work!"); // Print out correct response
                    break;
                case 3:
                    System.out.println("Keep up the good work!"); // Print out correct response
                    break;
            }
        }
        else{
            switch(response){
                case 0:
                    System.out.println("No. Please try again."); // Print out wrong response
                    break;
                case 1:
                    System.out.println("Wrong. Please try again."); // Print out wrong response
                    break;
                case 2:
                    System.out.println("Don't give up!"); // Print out wrong response
                    break;
                case 3:
                    System.out.println("No. Keep trying."); // Print out wrong response
                    break; 
            }
        }
    }
    
    void printGrade(){
        if(((float)correct/(float)(correct+wrong))*100 > 74.0){ // If percentage is 75% or greater
            System.out.println("Congratulations, you are ready to go to the next level!"); // Congratulate user
        }
        else{
            System.out.println("Please ask your teacher for extra help."); // Prompt user to get extra help
        }  
    }
}
