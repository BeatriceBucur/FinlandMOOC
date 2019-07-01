package week1.exUpTo24;

import java.util.Scanner;

public class ex16EvenOrOdd {
    /*
    Create a program that asks the user for a number and tells whether the number is even or odd.
    --example--
    Type a number: 2
    Number 2 is even.

    --example--
    Type a number: 7
    Number 7 is odd.
     */

    public static void main(String[] args) {
        Scanner scanner   = new Scanner(System.in);
        System.out.println("type a number:");
         int number = scanner.nextInt();

         if(number%2==0){
             System.out.println("Number " + number+" is even");
         }else{
             System.out.println("number " + number+ " is odd");
         }
    }


}
