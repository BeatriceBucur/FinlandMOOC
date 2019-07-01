package week3.methodsPart2;

import java.util.Scanner;

public class ex47LengthOfAName {
    /*
    Create a program that asks for the user's name and says how many characters the name contains.
    Note!Your program should be structured so that you put the calculating of the name length in it's own method:
    public static int calculateCharacters(String text).
    The tests will be testing both the method calculateCharacters and the program overall.

    --example--

    Type your name: Paul
    Number of characters: 4
    --
     */

    public static int calculateCharacters( String text){
        return text.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Type your name: ");
        String name = scanner.nextLine();

        System.out.println("NUmber of characters: "+calculateCharacters(name));

    }
}
