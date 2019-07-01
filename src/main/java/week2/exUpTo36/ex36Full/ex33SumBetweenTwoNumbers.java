package week2.exUpTo36.ex36Full;

import java.util.Scanner;

public class ex33SumBetweenTwoNumbers {
    /*
    Similar to the previous exercise, except that the program should ask for both the lower and upper bound.
    You can assume that the users first gives the smaller number and then the greater number.
    ---Example outputs:
    First: 3
    Last: 5
    The sum 12
    3+4+5 = 7+5 = 12

    First: 2
    Last: 8
    The sum is 35
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Last: ");
        int lastNumber = scanner.nextInt();
        int sum = 0;

        for( int i = firstNumber; i<= lastNumber; i++){
            sum +=i;

        }
        System.out.println("The sum is " + sum);
    }

}
