package week2.exUpTo36.ex36Full;

import java.util.Scanner;

public class ex26SumOfManyNumbers {
    /*
    Create a program that reads numbers from the user and prints their sum.
    The program should stop asking for numbers when user enters the number 0.
    The program should be structured like this
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true){
            int read = Integer.parseInt(scanner.nextLine());
            if(read==0){
                break;
            }else{
                sum = sum + read;
                System.out.println("Sum now: " + sum );
            }
        }
        System.out.println("sum in the end: " + sum);

    }
}
