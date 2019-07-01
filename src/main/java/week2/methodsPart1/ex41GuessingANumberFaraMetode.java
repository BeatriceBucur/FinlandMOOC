package week2.methodsPart1;

import java.util.Scanner;

public class ex41GuessingANumberFaraMetode {

     /*
    Create a program that draws a number. Then the user has the chance to guess once, what the number is.
    The program should to print "The number is lesser",
    "The number is greater" or "Congratulations, your guess is correct!" depending on the number the user typed.
     */

    public static void main(String[] args) {

            int computerDrawNumber = (int) (Math.random()*100);
            //System.out.println("numarul alocat de computer este: " + computerDrawNumber);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Guess a number: ");
            int numberGuessed = scanner.nextInt();

            if (numberGuessed > computerDrawNumber) {
                System.out.println("The number is greater");
            } else if (numberGuessed < computerDrawNumber) {
                System.out.println("The number is lesser");
            } else {
                System.out.println("Congratulations, your guess is correct!");
            }
    }
}
