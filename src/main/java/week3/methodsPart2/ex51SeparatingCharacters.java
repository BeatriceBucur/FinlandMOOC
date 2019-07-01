package week3.methodsPart2;

import java.util.Scanner;

public class ex51SeparatingCharacters {

    /*
    Create a program that asks for the user's name and gives its characters separately.
    You do not need to create methods in this exercise.

    Type your name: Paul
    1. character: P
    2. character: a
    3. character: u
    4. character: l

    Hint: using a while loop helps in this exercise!
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = scanner.nextLine();
        int i = 0;
        while((i<name.length())&& name.length()>3){

            System.out.println((i+1)+". "+"character: " + name.charAt(i));
            i++;
        }

    }
}



