/**
 *
 * CMPSC 221 Program #8
 * Date.java
 * Purpose: Provides methods and constructors to print out many date formats
 * 
 * @author Collin Enders
 */

package dates;

public class Date {
    
    private int monthNum = 0; // Variable for storing month number
    private int day = 0; // Variable for storing day number
    private int year = 0; // Variable for storing year number
    private String monthString = ""; // Variable for storing month name as a string
    
    // Date constructor for format "MM/DD/YYYY"
    public Date(int month, int day, int year){
        this.monthNum = month;
        this.day = day;
        this.year = year;
    }
    
    // Date constructor for format "June 14, 1992"
    public Date(String month, int day, int year){
        this.monthString = month;
        this.day = day;
        this.year = year;
    }
    
    // Date constructor for format "DDD YYYY"
    public Date(int day, int year){
        this.day = day;
        this.year = year;
    }
    
    // Prints out object's date depending on which constructor is used
    public void printDate(){
        // Format MM/DD/YYYY
        if(monthNum != 0 && day != 0 && year != 0){
            System.out.println("Today's date is " + monthNum + '/' + day + '/' + year);
        }
        // Format "June 14, 1992"
        else if(!monthString.equals("")){
            System.out.println("Today's date is " + monthString + ' ' + day + ", " + year);
        }
        // Format "DDD YYYY"
        else if(monthString.equals("") && monthNum == 0){
            System.out.println("Today's date is " + day + ' ' + year);
        }
    }
}
