package computerassistedinstruction;

/**
 * CMPSC 221 Program #5
 * ComputerAssistedInstruction.java
 * Purpose: Perform a math test
 * 
 * @author Collin Enders
 */
public class ComputerAssistedInstruction {

    public static void main(String[] args) {
        
        MathTest math = new MathTest(); // Create new MathTest object
        
        System.out.println("Please answer the following question:"); // Prompt user to answer questions
        math.askQuestion(10); // Ask 10 questions
        math.printGrade(); // Print out result
    }
    
}
