package week3.methodsPart2;

public class ex46AverageOfGivenNumbers {

    /*
    Create the method average, which calculates the average of the numbers it gets as parameters.
    Inside the method you should use the method sum as a helper!
     */

    public static double average( int number1, int number2, int number3, int number4){
        int sum = number1+number2+number3+number4;
        double average = (double) sum/4;
        return average;
    }

    public static void main(String[] args) {
        double result = average(4,3,6,1);
        System.out.println("average: " + result);
    }
}
