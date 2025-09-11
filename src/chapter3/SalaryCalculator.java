package chapter3;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main (String[] args) {

        /*
        IF statement
        All salespeople get a payment of 1000$ a week
        Salespeople who exceed 10 sales get an additional bonus of $250
        */

        /*
        1. First thing that I want to do is initialize the known values.
        2. second thing is to get what I don't know
        3. Third, after I have all of the values that I need, then I can use my quick detour for the bonues earners.
        4. Lastly, the calculation for the output
        */


        // Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // Unknown sales the employees made for the week - let's ask them
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close(); // done getting the input, so close the scanner

        if(sales > quota) {
            salary += bonus;
        }

        System.out.println("The employee's pay is $" + salary);
    }
}
