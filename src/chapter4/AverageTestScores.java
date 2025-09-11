package chapter4;
import java.util.Scanner;

public class AverageTestScores {

    /*
    NESTED LOOPS
    Find the average test scores for each student in the class.
    There are 24 students and 4 tests.
    */

    public static void main(String[] args){

        // what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<numberOfStudents; i++){

            double total = 0;

            for(int j=0; j<numberOfTests; j++){
                System.out.println("For student #" + (i+1) + ", Enter the score for Test #" + (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }

            double average = total/numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is " + average);
        }

        scanner.close();
    }
}
