package week2.methodsPart1;

public class ex39Printing2 {
    /*
    Exercise 39.2: Printing a square
    Create a method printSquare(int sideSize) that prints a square using our previous method printStars.
    The method call printSquare(4), for example, prints the following:
    ****
    ****
    ****
    ****
    Note: in order to complete the exercise it is not enough that the outprint looks good.
    Inside the printSquare method the printing must be done using the printStars method.

    When you are in the middle of making your program, you should verify the correctness of
    your methods by writing some test code into your main method.
     */

    public static void printSquare(int sideSize){
        int i = 1;
        while(i<=sideSize){
            printStars(sideSize);
            i++;
        }
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
        printSquare(4);
    }
}
