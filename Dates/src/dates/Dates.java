/**
 *
 * CMPSC 221 Program #8
 * Dates.java
 * Purpose: Print many date formats using overloaded constructors and one method
 * 
 * @author Collin Enders
 */

package dates;

public class Dates {
    public static void main(String[] args) {
        Date date1 = new Date(12, 12, 2016); // Create date object in format "MM/DD/YYYY"
        Date date2 = new Date("June", 14, 1992); // Create date object in format "June 14, 1992"
        Date date3 = new Date(111, 2016); // Create date object in format "DDD YYYY"
        
        date1.printDate(); // Print out first object created
        date2.printDate(); // Print out second object created
        date3.printDate(); // Print out third object created
    }
}
