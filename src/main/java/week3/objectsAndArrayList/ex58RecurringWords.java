package week3.objectsAndArrayList;

import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class ex58RecurringWords {
    /*
    Create a program that asks the user to input words until the user gives the same word twice.

     */
    public static void main(String[] args) {


       // ArrayList<String> words = new ArrayList<String>();
        HashSet <String> words = new HashSet <String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("type a word: ");
       // String input = scanner.nextLine();

        while (words.add(scanner.nextLine())) {
            System.out.println("type a word: ");
        }
        System.out.println("You gave the word"+ words+"twice " );
    }
}
