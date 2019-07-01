package week2.exUpTo36.ex36Full;

import java.util.Scanner;

public class ex34Factorial {
    /*
    Create a program that calculates the factorial of the number n. The factorial n! is calculated using
    the formula 1*2*3*...*n. For example 4! = 1*2*3*4 = 24. Additionally, it is defined that 0! = 1.
    --Example outputs:
    Type a number: 3
    Factorial is 6

    --example:
    Type a number: 10
    Factorial is 3628800
     */

    static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return(n*factorial(n-1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println("Type a number: ");
        int number = scanner.nextInt();
        int i;
        int fact  = 1;
        int factorial  = number;
        fact = factorial(number);
        System.out.println("Factorialul numarului " + number + " este " + fact);

    }


}
