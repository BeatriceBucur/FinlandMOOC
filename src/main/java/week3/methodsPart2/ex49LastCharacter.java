package week3.methodsPart2;

import java.util.Scanner;

public class ex49LastCharacter {
    /*
    Create a program that asks for the user's name and gives the last character.
    Note! Your program should be structured so that you put the search for the last character in its own method:
    public static char lastCharacter(String text).
    The tests will be testing both the method lastCharacter and the program overall.
    --ex--
    Type your name: Paul
    Last character: l

     */

    public static char lastCharacter(String text){
        return text.charAt(text.length()-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TYpe your name: ");
        String name = scanner.nextLine();
        System.out.println("Last Character: " + lastCharacter(name));
    }
}
