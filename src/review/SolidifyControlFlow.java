package review;
import java.util.Scanner;

public class SolidifyControlFlow {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Enter a number: ");
        int response = scanner.nextInt();

        isPrime(response);

    }

    public static void isPrime(int response){
        if(response == 1){
            System.out.println("Prime!");
        }

    }

}
