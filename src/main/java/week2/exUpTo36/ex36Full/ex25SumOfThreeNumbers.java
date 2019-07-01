package week2.exUpTo36.ex36Full;

import java.util.Scanner;

public class ex25SumOfThreeNumbers {

    /*
    Create a program that asks the user for three numbers and then prints their sum.
    Use the following structure in your program:

    Scanner reader = new Scanner(System.in);
    int sum = 0;
    int read;

    // WRITE YOUR PROGRAM HERE
    // USE ONLY THE VARIABLES sum, reader AND read!

    System.out.println("Sum: " + sum);
    ---OUTPUT--
    Type the first number: 3
    Type the second number: 6
    Type the third number: 12

    Sum: 21
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Type the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("type the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("type the third number: ");
        int thirdNumber= scanner.nextInt();
        sum = firstNumber+secondNumber+thirdNumber;
        System.out.println("Sum: " + sum);

    }
}
