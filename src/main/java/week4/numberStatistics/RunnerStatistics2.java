package week4.numberStatistics;

import java.util.Scanner;
/*
Create a program that asks the user to input numbers of type integer.
When the user gives -1, the program stops and prints the sum of the given numbers (excluding the -1).

Note: you should not make any changes to class NumberStatistics!

The program should use a NumberStatistics object to calculate the sum.
 */

public class RunnerStatistics2 {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your numbers: ");
        int ceva = Integer.parseInt(scanner.nextLine());
        while(ceva > 0){
            stats.addNumber(ceva);
            ceva = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Sum of numbers is: " + stats.sumOfNumbers());
        System.out.println("average is: " + stats.average());

    }
}
