package review;

import java.util.Random;
import java.util.Scanner;

public class Droid {

    private String name;
    private int energyLevel = 100;
    private Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Droid starWarsBot = new Droid("R2D2");
        System.out.println(starWarsBot.toString());

        boolean isFinished = false;

        while(!isFinished) {
            starWarsBot.performTask();

            // if energy is 0, stop automatically
            if (starWarsBot.getEnergy() <= 0) {
                System.out.println(starWarsBot.getName() + " has no more energy!");
                break;
            }

            System.out.println("Would you like me to do another task? Y or N");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                isFinished = true;
            }
        }
        starWarsBot.energyReport();
    }

    public void energyReport() {
        System.out.println("Energy levels at: " + this.energyLevel);
    }

    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getEnergy(){
        return this.energyLevel;
    }

    public Droid(String name){
        this.name = name;
    }

    public String toString(){
        return "Hello, I'm " + this.name + "!";
    }

    public void performTask() {

            System.out.println("What task would you like me to perform?");
            String task = scanner.nextLine();

            int randomEnergyUsage = random.nextInt(11); // 0-10
            energyLevel -= randomEnergyUsage;

            if(energyLevel < 0){
                energyLevel = 0;
            }

            System.out.println("Doing task: " + task + ". Energy reduced to: " + energyLevel);
    }
}

