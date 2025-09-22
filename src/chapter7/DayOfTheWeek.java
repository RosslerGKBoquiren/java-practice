package chapter7;
import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {

        boolean isFinished = false;
        Scanner scanner = new Scanner(System.in);

        String[] daysOfTheWeek = {
                "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"
        };

        while (!isFinished) {
            boolean isCorrect = false;

            while (!isCorrect) {
                System.out.print("Input a number (1-7) corresponding to the day of the week: ");
                String userInput = scanner.nextLine();

                try {
                    int index = Integer.parseInt(userInput);

                    if (index >= 1 && index <= 7) {
                        System.out.printf("User inputs the number %d -> %s%n", index, daysOfTheWeek[index - 1]);
                        isCorrect = true;
                    } else {
                        System.out.println("Invalid input! Please enter a number between 1 and 7.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("That’s not a valid number! Try again.");
                }
            }

            System.out.println("Would you like to continue? (Press any key for Y or N)");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("n")) {
                System.out.println("Goodbye!");
                isFinished = true;
            }
        }
    }
}
