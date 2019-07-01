package week1.exUpTo24;

import java.util.Scanner;

public class ex22Password {
    /*
    In this exercise we create a program that asks the user for a password.
    If the password is right, a secret message is shown to the user.
    --ex--
    Type the password: turnip
    Wrong!
    Type the password: beetroot
    Wrong!
    Type the password: carrot
    Right!

    The secret is: jryy qbar!
    --
    The program will be done in three steps.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("type the passwork: ");
            String password = scanner.nextLine();
            if (password.equals("carrot")) {
                System.out.println("Right!");
                break;
            } else {
                System.out.println("Wrong!");
            }

        }
        System.out.println("The secret is: jryy qbar!");
    }
}
