package week2.methodsPart1;

import java.util.Scanner;

public class ex41RepeatedGuessing2 {

    /*
    Develop your program by adding the following functionality:
    the guessing should be made repeatedly until the user types the right number.
    Note that you need to draw the number by using the drawNumber command before the repetition.
    Why? What happens if you draw the number inside the repetition?
     */

    public static void main(String[] args) {

        int computerDrawNumber = (int) (Math.random() * 100);
        System.out.println("numarul alocat de computer este: " + computerDrawNumber);

        Scanner scanner = new Scanner(System.in);
        int guessCount =0;
        while (true){

        System.out.println("Guess a number: ");

        int numberGuessed = scanner.nextInt();
            guessCount++;

            if (numberGuessed > computerDrawNumber) {
                System.out.println("The number is greater, guesses made: "+ guessCount);

            } else if (numberGuessed < computerDrawNumber) {
                System.out.println("The number is lesser, guesses made: " + guessCount);


            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }

        }
    }
}

