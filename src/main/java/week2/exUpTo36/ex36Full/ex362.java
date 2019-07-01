package week2.exUpTo36.ex36Full;

import java.util.Scanner;

public class ex362 {
    /*
    Exercise 36.2: The sum of the numbers
    Develop your number reading program by adding the following feature:
    the program should print the sum of the numbers entered by the user (without the number -1).
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a series of numbers and (-1) to quit: ");
        int sum = 0;
        while (true) {
            int numbers = Integer.parseInt(scanner.nextLine());
            if (numbers > 0) {
                sum += numbers;
            }
            if (numbers < 0) {
                System.out.println("Thank you and see you later!");
                break;
            }
        }
        System.out.println("the sum is: " + sum);
    }
}

