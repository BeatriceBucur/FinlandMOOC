package week3.methodsPart2;

import java.util.Scanner;

public class ex54TheEndPart {
    /*
    Create a program that prints the end part of a word.
    The program asks the user for the word and the length of the end part.
    Use the substring method in your program.
    --
    Type a word: example
    Length of the end part: 4
    Result: mple
     */

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = scanner.nextLine();
        System.out.println("length of the end part: ");
        int length = scanner.nextInt();
        System.out.println("result: " + word.substring(length-1));
    }
}
