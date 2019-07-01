package week1.exUpTo12;

import java.util.Scanner;

public class ex6Addition {
    /*
    Create a program to calculate the sum of two numbers.
    At the beginning of the program two variables are introduced and
    those variables hold the numbers to be summed.
    Feel free to use other variables if you need to.
    For example, if the variables hold numbers 5 and 4, the program should output:
    5 + 4 = 9
    If the variables hold numbers 73457 and 12888, the program output should be:
    73457 + 12888 = 86345
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //System.out.println("primul numar este: ");

        int xNumber = scanner.nextInt();
        //System.out.println("al 2-lea numar este: ");
        int yNumber = scanner.nextInt();

        int sum = xNumber+yNumber;
        System.out.println(xNumber+ " + " + yNumber+ " = " + sum);




    }
}
