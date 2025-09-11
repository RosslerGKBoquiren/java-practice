package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    // name it all caps to know that the variable is a constant
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args){

       int[] ticket = generateNumber();
       Arrays.sort(ticket);
       printTicket(ticket);
    }

    public static int[] generateNumber(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for(int i=0; i<LENGTH; i++){
            int randomNumber;

            // generate rando number then search to make sure it doesn't already exist in the array. If it does, regenerate and search again.
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while(search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }

        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor){
        // this is called an enhanced loop
        // it iterates through an array and each time assigns the current element to a 'value'
        for(int value : array) {
            if(value == numberToSearchFor){
                return true;
            }
        }
        // if we reach this point, then the entire array was searched and the value was not found
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor){
        // array must be sorted first
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, numberToSearchFor);
        if(index >= 0){
            return true;
        }
        else return false;
    }

    public static void printTicket(int ticket[]){
        for(int i=0; i<LENGTH; i++){
            System.out.println(ticket[i] + " | ");
        }
    }


}
