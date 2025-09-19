package Debugging;

public class BuggyProgram {

    public static void main(String[] args) {
        // Should print "Welcome to Bug Detective!"
        // system.out.Println("Welcome to Bug Detective!);
        System.out.println("Welcome to Bug Detective!"); // solution

        int[] numbers = {2, 4, 6, 8, 10};

        // BUG #1: This loop has an error
        // for (int i = 0; i <= numbers.length; i++) {
        //      System.out.println("Number: " + numbers[i]);
        // }
        for (int number : numbers) {
            System.out.println("Number: " + number); // solution
        }


        // BUG #2: This method call is broken
        // int result = multiply(3, "5");
        // System.out.println("Result is: " + result);
        int result = multiply(3, 5); // solution
        System.out.println("Result is: " + result);

        // BUG #3: Should only run if condition is true
        // if (5 = 5) {
        //      System.out.println("Math works!");
        // }
        if (numbers.length == 5) { // solution
            System.out.println("Math works!");
        }
    }

    // BUG #4: Wrong return type & parameter usage
    public static int multiply(int a, int b) {
        return a * b;
    }
}
//}
