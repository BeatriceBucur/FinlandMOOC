package week3.methodsPart2;

import java.util.Scanner;

public class ex48FirstCharacter {
    /*
    Create a program that asks for the user's name and gives the first character.

    --example--
    Type your name: Paul
    First character: P

     */

    public static char firstCharacter(String text){
        return text.charAt(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name  = scanner.nextLine();
        System.out.println("First character: "+ firstCharacter(name));

    }
}
