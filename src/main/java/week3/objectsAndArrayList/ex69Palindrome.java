package week3.objectsAndArrayList;

import java.util.Scanner;

public class ex69Palindrome {
    /*
Create the method palindrome that checks if a string is a palindrome (reads the same forward and backward).

The method can use the method reverse (from assignment number 56. Reversing text) as a helper.
The method type is boolean,
so it returns either true (the string is a palindrome) or false (the string is not a palindrome).
     */

    public static boolean palindrome (String text) {
        boolean isPalindrome = true;
        while (isPalindrome) {
            for (int i = 0; i < text.length(); i++) {
                int j = text.length() - 1;
                if (text.charAt(i) == text.charAt(text.length() - i - 1)) {
                    i++;
                    j--;
                    return true;
                } else {
                    return false;
                }
            }
            //return isPalindrome;
        }
        return isPalindrome;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = scanner.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }


}
