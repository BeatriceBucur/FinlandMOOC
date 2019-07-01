package week2.methodsPart1;

public class ex40PrintingLikeABoss1 {
    /*
    Exercise 40.1: Printing stars and whitespaces
    Create a method printWhitespaces(int size) that prints the given amount of whitespaces.
    The method should not print a line break.

    Reimplement or copy the method printStars(int size) from the previous exercise.
     */

    private static void printWhitespaces(int size){
        int i = 0;
        while (i<size){
            System.out.print(".");
        i++;
    }

        System.out.println(" ");
    }

    private static void printStars(int amount) {
        int i = 1;
        while(i<=amount){
            System.out.print("*");
            i++;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        printWhitespaces(2);
        printStars(2);

    }
}
