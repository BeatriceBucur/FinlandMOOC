package week3.methodsPart2;

import java.util.Scanner;

public class ex52ReversingAName {
    /*
    Create a program that asks for the user's name and prints it in reverse order.
    You do not need to create a separate method for this.

        Type your name: Paul
        In reverse order: luaP
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println("type your name: ");
        String name  = scanner.nextLine();
        int i = 0;
        System.out.print("in reverse order: ");
        while ( i<name.length()){
            System.out.print (name.charAt(name.length()-1-i));
            i++;
        }
    }
}
