package week2.exUpTo36.ex36Full;

import java.util.Scanner;

public class ex35SumOfPowers {
    /*
    Create a program that calculates the sum of 2^0+2^1+2^2+...+2^n, where n is a number entered by the user.
    The notation 2i means raising the number 2 to the power of i, for example 2^4 = 2*2*2*2 = 16.
    In Java we cannot write a^b directly,
    but instead we can calculate the power with the command Math.pow(number, power).
    Note that the command returns a number of double type (i.e. floating point number).
    A double can be converted into the int type (i.e. whole number) as follows: int result = (int)Math.pow(2, 3).
    This assigns the value of 23 to variable result.

    --Example outputs:
    Type a number: 3
    The result is 15

    --example outputs:
    Type a number: 7
    The result is 255
    */

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("type a number: ");
        double power = scanner.nextDouble();
        System.out.println("we will calculate 2 raised at the power of " + power);
        int sum=0;
        int i = 0;
        while(i<=power) {
            sum +=  (int) Math.pow(2, i);
            i++;

        }


        System.out.println("the result is " + sum);

    }
}
