package review;

import java.util.Random;

public class PrimeDirective {

    private static int max = 7;
    static int[] integers = new int[max];
    static Random random = new Random();

    public static void main(String[] args){

        for(int i=0; i<max; i++){
            integers[i] = random.nextInt(100) + 1;
        }

        // Print all numbers for reference
        System.out.print("Generated numbers: ");
        for(int num : integers){
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Check each number and print if it is prime
        System.out.println("Prime numbers in the array:");
        for(int num : integers){
            if(isPrime(num)){
                System.out.println(num);
            }
        }
    }


    public static boolean isPrime(int number){
        if(number <= 1) return false;

        for(int i = 2; i<= Math.sqrt(number); i++){
            if(number % i == 0) return false;
        }

        return true;
    }
}
