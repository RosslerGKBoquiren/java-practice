package review;

public class FizzBuzz {

    public static void main(String[] args){

        int minNum = 1;
        int maxNum = 100;

        for(int i = minNum; i<=maxNum; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is a FizzBuzz" + "\n");
            } else if (i % 3 == 0) {
                System.out.println(i + " is a Fizz" + "\n");
            } else if (i % 5 == 0) {
                System.out.println(i + " is a Buzz" + "\n");
            } else {
                System.out.println(i + "\n");
            }
        }

    }
}
