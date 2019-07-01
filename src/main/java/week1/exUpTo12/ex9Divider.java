package week1.exUpTo12;

import java.util.Scanner;

public class ex9Divider {
    /*
    Create a program that asks the user for two integers and prints their quotient.
    Make sure that 3 / 2 = 1.5. If the decimal part is missing,
    take another look at 6.1 Floating point numbers (decimal numbers) to find the solution.
    ---
    Type a number: 3
    Type another number: 2

    Division: 3 / 2 = 1.5
    ---
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number: ");
        int numberOne = scanner.nextInt();

        System.out.println("Type another number: ");
        int numberTwo = scanner.nextInt();

       double divider =  (double)numberOne/numberTwo;

        System.out.println("division: " + numberOne + "/" + numberTwo + " = " + divider);

    }
}
