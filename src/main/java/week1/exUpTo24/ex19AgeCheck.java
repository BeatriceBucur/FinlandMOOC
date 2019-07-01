package week1.exUpTo24;

import java.util.Scanner;

public class ex19AgeCheck {
    /*
    Create a program that asks for the user's age and checks that it is reasonable (at least 0 and at most 120).
    --ex--
    How old are you? 10
    OK
    --ex--
    How old are you? 150
    Impossible!
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        if(age<=100 && age > 0){
            System.out.println("OK");
        }else if(age>100){
            System.out.println("impossible!");
        }else{
            System.out.println("impossible!");
        }
    }
}
