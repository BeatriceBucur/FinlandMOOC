package week2.methodsPart1;

public class ex39Printing1 {
    /*    Exercise 39.1: Printing stars
    Create a method printStars that prints the given amount of stars and a line break.
    Create the method in the following body:
    private static void printStars(int amount) {
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times     }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);    }
    --output--
    *****
    ***
    *********
    --
     */

    private static void printStars(int amount) {
        int i = 1;
        while(i<=amount){
            System.out.print("*");
            i++;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        printStars(10);
        printStars(7);
        printStars(3);
    }
}
