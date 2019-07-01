package week1.exUpTo24;

import java.util.Scanner;

public class ex15AgeOfMajority {
    /*
    Create a program that asks for the user's age
    and tells whether the user has reached the age of majority (i.e. 18 years old or older).

    ---example--
    How old are you? 12
    You have not reached the age of majority yet!

    --example---
    How old are you? 32
    You have reached the age of majority!
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int ageInput = scanner.nextInt();

        if(ageInput>=18){
            System.out.println("You have reached the age of majority!");
        }else{
            System.out.println("you have not reached the age of majority yet!");
        }
    }
}
