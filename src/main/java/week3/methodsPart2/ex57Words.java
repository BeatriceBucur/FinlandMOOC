package week3.methodsPart2;

import java.util.ArrayList;
import java.util.Scanner;

public class ex57Words {
    /*
    Create a program that asks the user to input words until the user types in an empty String.
    Then the program prints the words the user gave.
    Try the for repetition sentence here.
    Use an ArrayList structure in your program. ArrayList is defined like this:
    ArrayList<String> words = new ArrayList<String>();
    Note: an empty String can be detected this way:
    String word = reader.nextLine();
    if ( word.isEmpty() ) {  // could also be: word.equals("")
   // word was empty, meaning that the user only pressed enter
   }
   --expected output--
    Type a word: Mozart
    Type a word: Schubert
    Type a word: Bach
    Type a word: Sibelius
    Type a word: Liszt
    Type a word:
    You typed the following words:
    Mozart
    Schubert
    Bach
    Sibelius
    Liszt
     */

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("type a word: ");
        String input = scanner.nextLine();
        while (!input.equals(".")) {
            words.add(input);
            System.out.println("type a word: ");
            input = scanner.nextLine();
        }
        System.out.println("you typed the following words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }

}



