package week3.objectsAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ex58RecurringWord {
    /*
    Create a program that asks the user to input words until the user gives the same word twice.
    Use an ArrayList structure in your program. ArrayList is defined like this:
    ArrayList<String> words = new ArrayList<String>();
    --example--
    Type a word: carrot
    Type a word: celery
    Type a word: turnip
    Type a word: rutabaga
    Type a word: celery
    You gave the word celery twice

    Hint: Remember that ArrayList has the method .contains()
     */

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        //System.out.println("type a word: ");
        //String input = scanner.nextLine();

        boolean duplicateFound = false;

        while (!duplicateFound) {

            System.out.println("type a word: ");
            String input = scanner.nextLine();

            if (words.contains(input)) {
                System.out.println("you gave the word " + input + " twice");
                return;
            } else {
                words.add(input);
            }
        }
    }

    public static void bla(){

    }
}
// 1. mimi -> words mimi ->
// 1. mimi -> ? mimi words? nu-> o bag
// 2. mimi -> ? mimi words? Da. same word twice.


