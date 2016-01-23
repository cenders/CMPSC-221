package heartrate;

import java.util.Calendar;

/**
 * CMPSC 221 Program #2
 * HeartRates.java
 * Purpose: Calculate heart rate data from user-supplied data
 * 
 * @author Collin Enders
 */
public class HeartRates {
    private String firstName, lastName; // String variables for first and last names
    private int age, birthYear, birthMonth, birthDay; // Int variables for storing birthdate and age in years
    
    public HeartRates(String first, String last, int day, int month, int year){ // Class constructor
        this.firstName = first; // Assign this instance of firstName to first
        this.lastName = last; // Assign this instance of lastName to last
        this.birthDay = day; // Assign this instance of birthDay to day
        this.birthMonth = month; // Assign this instance of birthMonth to month
        this.birthYear = year; // Assign this instance of birthYear to year
    }
    
    void calcAge(){ // Calculate the age of the subject
        if((Calendar.getInstance().get(Calendar.MONTH) + 1) < birthMonth){ // Tests if current month is less than birth month
            age = Calendar.getInstance().get(Calendar.YEAR) - birthYear - 1; // Has not had a birthday this year
        }
        else if((Calendar.getInstance().get(Calendar.MONTH) + 1) == birthMonth){ // Tests if this is his or her birth month
            if((Calendar.getInstance().get(Calendar.DAY_OF_MONTH)) < birthDay){ // Tests if day of month is less than birth day of month
                age = Calendar.getInstance().get(Calendar.YEAR) - birthYear - 1; // Has not had a birthday this year
            }
            else{ // Current day of month is greater than birth day of month
                age = Calendar.getInstance().get(Calendar.YEAR) - birthYear; // Already had a birthday this year
            }
        }
        else{ // Current month is greater than birth month
            age = Calendar.getInstance().get(Calendar.YEAR) - birthYear; // Already had a birthday this year
        }
    }
    
    int calcMaxRate(){ // Calculates and returns the max heart rate
        return 220 - age; // Max heart rate is 220 - age in years
    }
    
    String targetRate(){ // Calculates and returns a person's target heart rate and returns the range as a string
        return (calcMaxRate() * .5) + " - " + (calcMaxRate() * .85); // Range is 50% - 85%
    }
    
    void print(){ // Prints out all results/information from the calculations
        System.out.println("Name: " + firstName + ' ' + lastName); // Print full name
        System.out.println("DOB: " + birthDay + '/' + birthMonth + '/' + birthYear); // Print Date of Birth
        System.out.println("Maximum heart rate: " + calcMaxRate() + " BPM"); // Print max heart rate
        System.out.println("Target heart rate: " + targetRate() + " BPM"); // Print target heart rate
    }
    
    void setFirstName(String name){ // Set method for the first name
        firstName = name;
    }
    String getFirstName(){ // Get method for the last name
        return firstName;
    }
    
    void setLastName(String name){ // Set method for the last name
        lastName = name;
    }
    String getLastName(){ // Get method for the last name
        return lastName;
    }
    
    void setAge(int newAge){ // Set method for the age
        age = newAge;
    }
    int getAge(){ // Get method for the age
        return age;
    }
    
    void setBirthDay(int day){ // Set method for the birth day
        birthYear = day;
    }
    int getBirthDay(){ // Get method for the birth day
        return birthDay;
    }
    
    void setBirthMonth(int month){ // Set method for the birth month
        birthYear = month;
    }
    int getBirthMonth(){ // Get method for the birth month
        return birthMonth;
    }
    
    void setBirthYear(int year){ // Set method for the birth year
        birthYear = year;
    }
    int getBirthYear(){ // Get method for the birth year
        return birthYear;
    }
}
