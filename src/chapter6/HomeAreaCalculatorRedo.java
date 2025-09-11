package chapter6;
import java.util.Scanner;
/*
so far, most of the methods we looked at have taken primitive data type as its parameters such as int and char.
But, we can use objects as the arguments for methods as well
 */

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){ // static is used for members of a class which can be access without using an instance

        // we don't want to use static therefore we would need to create an instance of the class we are in and then call the methods
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        // now that we can use this calculator object, let's use the dot operator to call the getRoom() method
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);

        calculator.scanner.close();
    }

    public Rectangle getRoom(){
        // this method is not going to return a primitive data type, it's going to return the Rectangle object.

        System.out.println("Enter the length of your room: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room: ");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
