package week1.exUpTo24;

import java.util.Scanner;

public class ex14APositiveNumber {
    /*
    Create a program that asks the user for a number and tells if the number is positive (i.e. greater than zero).
    example:
    Type a number: 5
    The number is positive.

    example:
    Type a number: -2
    The number is not positive.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type a number:");
        int numberIN = scanner.nextInt();


        if(numberIN>=0){
            System.out.println("THe number is positive.");
        }else{
            System.out.println("The number is not positive");
        }
    }
}
