package week3.methodsPart2;

import java.util.Scanner;

public class ex56ReversingText {
    /*
    Create the method reverse that puts the given string in reversed order.

    Hint: you probably need to build the reversed string character by character in your method.
    You can use a String-type variable as a helper during the building process.
    In the beginning, the helper variable should have an empty string of characters as a value.
    After this, new characters are added to the string one by one.
     */

    public static String reverse(String text) {
        // write your code here

        int i = 0;

        while (i < text.length()) {
            System.out.print(text.charAt(text.length() - 1 - i));
            i++;
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = scanner.nextLine();
        //System.out.println("In reverse order: " + reverse(text));
        System.out.print("in reverse order: ");
        reverse(text);


    }
}
