package week2.exUpTo36.ex36Full;

import java.util.Scanner;

public class ex361 {
    /*
    This set of exercises will form one larger program when put together.
     We create the program by adding features exercise by exercise.

     Exercise 36.1: Reading numbers
    Create a program that asks the user to input numbers (integers).
    The program prints "Type numbers” until the user types the number -1.
    When the user types the number -1, the program prints "Thank you and see you later!" and ends.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a series of numbers and (-1) to quit: ");
        while (true) {

            int numbers = Integer.parseInt(scanner.nextLine());
            if (numbers < 0) {
                System.out.println("Thank you and see you later!");
                break;
            }

        }
    }
}
