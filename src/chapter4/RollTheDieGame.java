package chapter4;
import java.util.Random;
import java.util.Scanner;

public class RollTheDieGame {

    /*
    Objective: to travel the entire game board of 20 spaces within 5 die rolls
    -roll the die for the user by generating a number between 1 - 6 and advance the user that number of spaces on the board
    -after each roll, tell the user which game space they are on and how many more spaces they have to go to win
    -repeat this 4 additional times for 5 rolls in total
    -if the user gets to 20 before 5 rolls, end the game - they win
    -if the user gets more or less than 20 spaces, they lose
    Remember, there are only 20 spaces on the board
    */

    public static void main(String[] args){

        // what we know
        int maxSpaces = 20;
        int maxRoll = 5;

        int numberOfSpace = 0;
        int numberOfRoll = 0;
        int remainingSpace = 20;

        // what we don't know
        for(int i=0; i<maxRoll; i++){
            Random random = new Random();
            int die = random.nextInt(6) + 1;

            numberOfSpace = numberOfSpace + die;
            remainingSpace = remainingSpace - die;
            numberOfRoll++;

            System.out.println("Roll #" + (i+1) + ": You've rolled a " + die + ". You are now on space " + numberOfSpace + " and have " + remainingSpace + " more to go.");

        }

        if(numberOfRoll == maxRoll){
            if(numberOfSpace == maxSpaces) {
                System.out.println("Congratulations, you've reached the 20th space within the roll limit!");
            } else if(numberOfSpace < remainingSpace){
                System.out.println("Sorry, you lucked out - you still have " + remainingSpace + " to go.");
            } else{
                System.out.println("Unfortunately, you went over the allowed spaces. Try again");
            }
        }
    }
}
