package chapter5;
import java.util.Scanner;

public class Greetings {
    public static void main (String[] args) {

        // ask a user for their name
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        greetUser(name);

    }

    public static void greetUser (String name) {
        // greet them by their name
        System.out.println("Welcome, " + name + "!");
    }
}
