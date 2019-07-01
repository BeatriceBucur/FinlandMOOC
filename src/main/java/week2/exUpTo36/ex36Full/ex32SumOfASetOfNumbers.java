package week2.exUpTo36.ex36Full;

import java.util.Scanner;

public class ex32SumOfASetOfNumbers {
    //Create a program that calculates the sum 1+2+3+…+n where n is a number entered by the user.
    //Example outputs:
    //Until what? 3
    //Sum is 6

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Until what? ");
        int targetNumber = scanner.nextInt();
        int i = 0;
        int sum = 0;
        while (i<=targetNumber){
            sum+=i;
            i++;
        }
        System.out.println("Sum is "+sum);

    }


}
