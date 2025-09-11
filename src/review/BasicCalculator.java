package review;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;

        while(!isFinished){
                System.out.println("********** Basic Calculator *********");
                System.out.print("Enter the first number: ");
                int number1 = scanner.nextInt();

                System.out.println("Enter the second number: ");
                int number2 = scanner.nextInt();

                System.out.println("Select an operation: ");
                System.out.println(" +, -, *, / ");
                String calculation = scanner.next();

                switch(calculation) {
                    case "+":
                        System.out.println("Answer: " + addition(number1, number2));
                        break;
                    case "-":
                        System.out.println("Answer: " + subtraction(number1, number2));
                        break;
                    case "*":
                        System.out.println("Answer: " + multiplication(number1, number2));
                        break;
                    case "/":
                        System.out.println("Answer: " + division(number1, number2));
                        break;
                    default:
                        System.out.println("Choose the correct operation.");
                        break;
                }

                System.out.println("Would you like to continue? Y or N");
                String toContinue = scanner.next();
                    if(toContinue.equalsIgnoreCase("n")) {
                    isFinished = true;
                }
            }
        }


    public static int addition(int number1, int number2){
        return number1 + number2;
    }

    public static int subtraction(int number1, int number2){
        return number1 - number2;
    }

    public static int multiplication(int number1, int number2){
        return number1 * number2;
    }

    public static double division(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return (double) number1 / number2;
    }
}
