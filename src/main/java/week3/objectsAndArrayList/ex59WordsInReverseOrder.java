package week3.objectsAndArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex59WordsInReverseOrder {
    /*
    Create a program that asks the user to input words, until the user gives an empty string.
     Then the program prints the words the user gave in reversed order, the last word is printed first etc.

   --ex--
    Type a word: Mozart
    Type a word: Schubert
    Type a word: Bach
    Type a word: Sibelius
    Type a word: Liszt
    Type a word:
    You typed the following words:
    Liszt
    Sibelius
    Bach
    Schubert
    Mozart
     */

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("scrie ceva aici: ");
            String input = scanner.nextLine();
            if (!input.isEmpty()) {
                words.add(input);

            } else {
                System.out.println("ai scris urmatoarele cuvinte in ordine inversa: ");
                Collections.reverse(words);
                for (String w : words) {
                    System.out.println(w);
                }
                return;
            }
        }
    }
}
