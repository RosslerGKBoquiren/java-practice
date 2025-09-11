package chapter6;

/*
Write a class that creates instances of the `Rectangle` class
to find the total area of two rooms in a house
*/
public class HomeAreaCalculator {

    public static void main(String[] args){

        /***************
         *RECTANGLE 1
         * **************/

        // Creating a new object - giving it a data type not limited to primitive data types but rather class types
        // let's declare this as type Rectangle - referencing the Rectangle class
        // so we have a type of object, it's type is Rectangle and we'll name this object room1.

        Rectangle room1 = new Rectangle(); // we are calling the constructor of Rectangle, the default one.
        room1.setWidth(25); // let's replace the default values 0 with 25 width and 50 length
        room1.setLength(50);

        // now that we have the width and length, let's calculate the area
        double areaOfRoom1 = room1.calculateArea();

        /*************
         *RECTANGLE 2
         ***************/

        Rectangle room2 = new Rectangle(30, 75 ); // here we are calling the second constructor and not the default
        double areaOfRoom2 = room2.calculateArea();

        // now that we have the 2 areas, we can get the totalArea by simply adding them together
        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of both rooms: " + totalArea);
    }
}
