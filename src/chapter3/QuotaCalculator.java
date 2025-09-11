package chapter3;
import java.util.Scanner;

public class QuotaCalculator {
    public static void main (String[] args) {

        /*
        IF ELSE
        All salespeople are expected to make at least 10 sales each week
        For those who do, they receive a congratulatory message
        For those who don't, they are informed of how many sales they were short
        */


        // values known
        int quota = 10;

        // unknown - the number of sales the employees make during the week
        System.out.println("Enter the number of sales the employee made this week.");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales >= quota) {
            System.out.println("Congratulations, you've made your quota");
        }
        else
        {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were " + salesShort + " sales short.");
        }
    }
}
