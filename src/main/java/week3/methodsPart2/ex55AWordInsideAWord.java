package week3.methodsPart2;

import java.util.Scanner;

public class ex55AWordInsideAWord {
    /*
    Create a program that asks the user for two words.
    Then the program tells if the second word is included in the first word.
    Use String method indexOf in your program.
    --ex---
    Type the first word: glitter
    Type the second word: litter
    The word 'litter' is found in the word 'glitter'.

    Type the first word: glitter
    Type the second word: clean
    The word 'clean' is not found in the word 'glitter'.
    ---
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type the first word: ");
        String firstWord = scanner.nextLine();
        System.out.println("type the second word: ");
        String secondWord = scanner.nextLine();
        int index = firstWord.indexOf(secondWord);
        //System.out.println(index);

        if (index == 1) {
            System.out.println("the word " + "'" + secondWord + "'" + " is found in the word " + "'" + firstWord + "'.");
        } else {
            System.out.println("the word " + "'" + secondWord + "'" + " is not found in the word " + "'" + firstWord + "'.");
        }
    }
}
