package week1.exUpTo12;

import java.util.Scanner;

public class ex12SumOfTheAges {
    /*
    Create a program that asks for the names and ages of two users.
     After that the program prints the sum of their ages.

     ---
     Type your name: Matti
     Type your age: 14

     Type your name: Arto
     Type your age: 12

     Matti and Arto are 26 years old in total.
        ---
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type your name: ");
        String nameUserOne = scanner.nextLine();

        System.out.println("type your age: ");
        int ageUserOne = scanner.nextInt();
        scanner.nextLine();

        System.out.println("type your name: ");
        String nameUserTwo = scanner.nextLine();

        System.out.println("type your age: ");
        int ageUserTwo = scanner.nextInt();

        System.out.println(nameUserOne+ " and "+ nameUserTwo + " are "+ (ageUserOne+ageUserTwo) + " years old in total.");
    }
}
