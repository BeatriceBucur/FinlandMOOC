package week2.exUpTo36.ex36Full;

import java.util.Scanner;

public class ex363 {
    /*
    Exercise 36.3: Summing and counting the numbers
    Develop your number reading and summing program by adding the following feature:
    the program should print how many numbers the user typed (without the number -1).
    Type numbers:
    5
    2
    4
    -1
    Thank you and see you later!
    The sum is 11
    How many numbers: 3
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a series of numbers and (-1) to quit: ");
        int sum = 0;
        int count = 0;
        while (true) {
            int numbers = Integer.parseInt(scanner.nextLine());
            if (numbers > 0) {
                sum += numbers;
                count++;
            }
            if (numbers < 0) {
                System.out.println("Thank you and see you later!");
                break;
            }
        }
        System.out.println("the sum is: " + sum);
        System.out.println("how many positive numbers: " + count);
    }
}

