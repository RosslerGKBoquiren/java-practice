package chapter5;
import java.util.Scanner;

public class Methods {

    public static void main(String[] args){

    }

    public static int calculateSum (int number1, int number2){
        int sum = number1 + number2;
        return sum;

        /*
        ACCESS MODIFIER
        the first word in a method header is the access modifier.
        It allows who can access this method.
        - PUBLIC means any code from any class can use this method.
        - PRIVATE
        - PROTECTED
        */

        /*
        NON-ACCESS MODIFIER
        - STATIC
        - FINAL
        - ABSTRACT
        - SYNCHRONIZED
        */

        /*
        RETURN TYPE
        This indicates the data type of the value that this method will return back to the code that calls it.
        This method calculates two numbers - it hast to specify the sum that will be returned, and it will be of the data
        type `int`.
        In previous programs we've worked on, we habe the main method which specified return type of `void`. Meaning
        it is not going to return any specific value.
        */

        /*
        NAME
        Every method requires a name - you should name your method to reflect the task that they are designed to do.
        By convention, they should begin with a verb, like 'calculate', and optionally, adjectives or nouns can follow
        such as 'Sum'.
        One deviation from this convention is for boolean data types.
        Their method names typically ask a question such as - isSumNegative.
        */

        /*
        SIGNATURE
        The signature consists of the `name` of the method and its `parameters`
        A method signature must be unique within a class - which is how they are identified
        */

        /*
        METHOD'S BODY
        The body consist of 0 or more statements that are to be executed should this method be called.
        */
    }
}
