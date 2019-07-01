package week2.exUpTo36.ex36Full;

import java.util.Scanner;

public class ex31UpperAndLowerLimit {
    /*
    Create a program that asks the user for the first number
     and the last number and then prints all numbers between those two.
     --example---
     First: 5
    Last: 8
    5
    6
    7
    8

    If the first number is greater than the last number, the program prints nothing:
    First: 16
    Last: 12
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("FIrst: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Last: ");
        int lastNumber = scanner.nextInt();
        if (firstNumber<=lastNumber){
            for(int i = firstNumber; i<=lastNumber; i++ ){
                System.out.println(i);
            }
        }
    }
}
