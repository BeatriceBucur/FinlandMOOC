package week2.exUpTo36.ex36Full;

import java.util.Scanner;

public class ex30UpToACertainNumber {
    /*
    Create a program that prints all whole numbers from 1 to the number the user enters.
    Up to what number? 3
    1
    2
    3
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("up to what number? ");
        int number = scanner.nextInt();
        int i = 1;
        while(i<=number){
            System.out.println(i);
            i++;
        }

    }
}
