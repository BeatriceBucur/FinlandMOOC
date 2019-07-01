package week1.exUpTo12;

import java.util.Scanner;

public class ex8Adder {
    /*
    Create a program that asks the user for two integers and then prints their sum.
    Type a number: 6
    Type another number: 2
    Sum of the numbers: 8

    In this example the user input is marked in red color.
    From now on the red color will indicate user input in examples.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type a number: ");
        int numberOne = scanner.nextInt();
        System.out.println("type another number: ");
        int numberTwo = scanner.nextInt();
        System.out.println("sum of the numbers: "+ (numberOne+numberTwo));


    }
}
