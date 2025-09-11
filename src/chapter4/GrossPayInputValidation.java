package chapter4;
import java.util.Scanner;

public class GrossPayInputValidation {

    /*
    WHILE LOOP
    Each store employee makes $15 an hour
    Write a program that allows a manager to enter the number of weekly hours worked
    for each employee and calculate their pay.
    Do not allow for overtime
    */

    public static void main(String[] args){

        // What we know
        int rate = 15;
        int maxHours = 40;

        // What we don't know
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // validate input
        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }

        /*
        While loop is controlled by a condition and will continue to run while that condition remains true
        The condition is tested before the loop is entered so there is a chance that this loop will never execute
        It's good to use the While loop when you may or may not need to run the loop based on the state of the condition
        */

        scanner.close();


        // calculate gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: $" + gross);

    }
}
