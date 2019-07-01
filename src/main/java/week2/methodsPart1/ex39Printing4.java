package week2.methodsPart1;

public class ex39Printing4 {
    /*
    Exercise 39.4: Printing a left-aligned triangle
    Create the method printTriangle(int size) that prints a triangle using the printStars method.
    The method call printTriangle(4), for example, has the following output:
    *
    **
    ***
    ****
     */

    private static void printTriangle(int size){

        for (int i = 1; i<=size; i++){
            printStars(i);
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
        printTriangle(7);
    }



}
