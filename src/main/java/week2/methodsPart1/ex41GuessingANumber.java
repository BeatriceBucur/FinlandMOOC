package week2.methodsPart1;

import java.util.Scanner;

public class ex41GuessingANumber {


    /*
    Create a program that draws a number. Then the user has the chance to guess once, what the number is.
    The program should to print "The number is lesser",
    "The number is greater" or "Congratulations, your guess is correct!" depending on the number the user typed.
     */


    public static int computerDrawANumber() {
        int number = (int) (Math.random() * 100);
        System.out.println("numarul alocat de computer este: " + number);
        return number;
    }


    public static boolean userGuess(int numberToBeGuessed){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number: ");

        int guessedNumber = scanner.nextInt();

        if (guessedNumber > numberToBeGuessed) {
            System.out.println("The number you guessed is greater");
            return false;
        } else if (guessedNumber < numberToBeGuessed) {
            System.out.println("The number you guessed is lesser");
            return false;
        } else {
            System.out.println("Congratulations, your guess is correct!");
            return true;
        }
    }

    public static void main(String[] args) {
        int numberToBeGuessed = computerDrawANumber();
        boolean hasGuessed = false;
        while(!hasGuessed) {
            hasGuessed = userGuess(numberToBeGuessed);
        }
    }
}


