package week1.exUpTo24;

import java.util.Scanner;

public class ex21LeapYear {
    /*
    A year is a leap year if it is divisible by 4.
    But if the year is divisible by 100, it is a leap year only when it is also divisible by 400.
    Create a program that checks whether the given year is a leap year.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("type an year: ");

        int year = scanner.nextInt();

        if(year %4==0){
            System.out.println("the year is a leap year");
        } else if(year %4 ==0 && year %100==0 && year %400==0){
            System.out.println("the year is a leap year");
        } else{
            System.out.println("the year is not a leap year");
        }
    }
}
