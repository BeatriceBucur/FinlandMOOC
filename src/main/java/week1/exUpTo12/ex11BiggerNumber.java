package week1.exUpTo12;

import java.util.Scanner;

public class ex11BiggerNumber {
    /*
    Create a program that asks the user for two integers and then prints the larger of the two.
    Tip: When you write Math. (that is, Math followed by a dot) in NetBeans, it shows you a bunch
    of available mathematical calculations. For example, Math.cos(10) calculates the cosine of the number 10.
    Try to find a suitable tool in Math to complete this exercise!
    If you cannot find anything suitable or do not know how to complete the exercise,
    skip the exercise for now. We will return to the matter later on.

    ---
    Type a number: 20
    Type another number: 14

    The bigger number of the two numbers given was: 20
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type first integer: ");
        int first = scanner.nextInt();
        System.out.println("type second integer: ");
        int second = scanner.nextInt();

        int bigger = Math.max(first,second);
        System.out.println("the bigger number of the two numbers given was: " + bigger);

    }



}
