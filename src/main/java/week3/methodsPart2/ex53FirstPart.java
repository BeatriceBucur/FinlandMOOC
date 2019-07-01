package week3.methodsPart2;

import java.util.Scanner;

public class ex53FirstPart {

    /*
    Create a program that prints the first part of a word.
    The program asks the user for the word and the length of the first part.
    Use the substring method in your program.
    --
    Type a word: example
    Length of the first part: 4
    Result: exam
    ---
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println("Type a word: ");
        String word = scanner.nextLine();
        System.out.println("length of the first part: ");
        int length = scanner.nextInt();
        System.out.println("result: " + word.substring(0,length));

        }
    }
