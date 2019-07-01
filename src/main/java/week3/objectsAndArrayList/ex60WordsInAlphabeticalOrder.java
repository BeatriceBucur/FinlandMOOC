package week3.objectsAndArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex60WordsInAlphabeticalOrder {
    /*
    Create a similar program as the previous one, but in which the words are printed in alphabetical order.
    --
    Type a word: Mozart
    Type a word: Schubert
    Type a word: Bach
    Type a word: Sibelius
    Type a word: Liszt
    Type a word:
    You typed the following words:
    Bach
    Liszt
    Mozart
    Schubert
    Sibelius
     */

    public static void main(String[] args) {
        ArrayList<String> composers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("type a word:");
            String input = scanner.nextLine();


            if (!input.isEmpty()) {
                composers.add(input);
            } else {
                System.out.println("you types the following words in alphabetical order: ");
                Collections.sort(composers);

                for (String c : composers) {
                    System.out.println(c);
                }
                return;
            }
        }
    }
}
