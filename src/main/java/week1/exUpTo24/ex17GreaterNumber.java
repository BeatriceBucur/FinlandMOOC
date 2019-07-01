package week1.exUpTo24;

import java.util.Scanner;

public class ex17GreaterNumber {
    /*
    Create a program that asks the user for two numbers and prints the greater of those two.
    The program should also handle the case in which the two numbers are equal.

    --Example outputs--
    Type the first number: 5
    Type the second number: 3
    Greater number: 5

    --ex--
    Type the first number: 5
    Type the second number: 5
    The numbers are equal!
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the first number:");
       int firstNumber =  scanner.nextInt();

        System.out.println("type the second number:");
        int secondNUmber = scanner.nextInt();

        if(firstNumber>secondNUmber){
            System.out.println("Greater number: " + firstNumber);
        }else if(firstNumber<secondNUmber){
            System.out.println("greater number: " + secondNUmber);
        }else{
            System.out.println("the numbers are equal!");
        }

    }
}
