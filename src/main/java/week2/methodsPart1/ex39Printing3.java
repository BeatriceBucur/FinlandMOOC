package week2.methodsPart1;

public class ex39Printing3 {
    /*
    Exercise 39.3: Printing a rectangle
    Create a method printRectangle(int width, int height)
    that prints a rectangle using the printStars method.
    the call printRectangle(17,3), for example, has the following output:
    *****************
    *****************
    *****************
     */

    private static void printRectangle(int width, int height){
        int i = 0;
        while( i<height){
            printStars(width);
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
        printRectangle(17,3);
    }
}
