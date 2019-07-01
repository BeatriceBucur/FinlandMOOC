package week3.methodsPart2;

public class ex43SumOfNumbers {
     /*
    Create the method sum that calculates the sum of numbers the method receives as parameters.
    Place the method in the following program body:
    public static int sum(int number1, int number2, int number3, int number4) {
    // write program code here
    // remember that the method needs a return in the end
    }

    public static void main(String[] args) {
    int answer = sum(4, 3, 6, 1);
    System.out.println("sum: " + answer);
    }
    --output--
    sum: 14

     */

    public static int sum(int number1, int number2, int number3, int number4) {

        return number1+number2+number3+number4;
    }

    public static void main(String[] args) {
        int answer = sum(4, 3, 6, 1);
        System.out.println("sum: " + answer);
    }
}

