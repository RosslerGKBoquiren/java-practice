package chapter6;

public class Rectangle {

    /*
    Encapsulation - one of the key principles of object-oriented programming. It specifies that the data (fields) of a class
    should be private and the methods (behaviours) of the class can be exposed(public) to other classes to use.
    */
    private double length;  // global variables or fields
    private double width;

    /*
    all objects have a constructor.
    The first type is `default constructor`
    Constructors start with an access modifier - public
    but no return type because they are not a method.
    Then the constructor's name must be the exact same name as the class
    */
    public Rectangle(){
        /*
        default constructor is known by its name because it does not have a parameter list. If someone
        wanted to create a Rectangle object and they did not want to set the length or width just yet, they can use this
        constructor without passing anything. The default constructor is typically used to assign default values to the fields
        */
        length = 0; // we dont use `this` here because we don't have a variable called length or width. So we are clearly talking about the global one
        width = 0;
    }

    // multiple constructors - you can have as many constructors as you want, all their names must be the same as the class name with different parameters
    // lets create another constructor for people who know the length and width
    public Rectangle(double length, double width){
        this.length = length; // can be set this way
        setWidth(width); // or can be set this way.
    }

    /*
    Access Modifier
    For other classes outside package chapter6 to be able to use class Rectangle's methods while field is private,
    we must add public.
    */


    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    // the parameter 'length' is not the same as the global field 'length'
    public void setLength(double length){
        /* 'this' keyword refers to `this` class. it's essentially saying to take the value of
        our local variable 'length' and assign it to our global one
        */
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
        /* The reason we had to use `this` in setWidth() is because of the scope. If we just said 'width' without
        `this`, it would think we are still talking about the width within our local scope. However, we are taking about
        the global one, so we this `this` to specify exactly which of these we're talking about.
        */
    }


    public double calculatePerimeter(){

        return (2 * length) + (2 * width);
    }

    public double calculateArea(){

        return length * width;
    }
}
