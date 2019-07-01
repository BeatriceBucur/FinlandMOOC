package week2.methodsPart1;

public class ex40PrintingLikeABoss2 {
    /*
    Exercise 40.2: Printing a right-aligned triangle
    Create the method pritnxmastree(int size) that prints a triangle using the mehtods printWhitespaces and printStars.
    Note: do not print anything in the method itself, just call the helper methods to do the actual printing.
    For example, the method call pritnxmastree(4) has the following output:
       *
      **
     ***
    ****


       *
      **
     ***
    ****
   *****




    helper:
    For the right aligned triangle, for each row :

    First: You need to print spaces from 0 to rowNumber - 1 - i.
    Second: You need to print \* from rowNumber - 1 - i to rowNumber.
    Note: i is the row index from 0 to rowNumber and rowNumber is number of rows.

     */

    private static void pritnxmastree(int size) {
        for (int i = 1; i <= size; i++) {

            printWhitespaces(size - i);
            printStars(i + (i - 1));
            printWhitespaces(size - i);
            System.out.println();



        }
        printStand(size - 2);
    }


    public static void printStand(int distanceFromEdge) {
        printWhitespaces(distanceFromEdge);
        printStars(3);
        System.out.println("");

        printWhitespaces(distanceFromEdge);
        printStars(3);

    }

    private static void printWhitespaces(int size) {
        int i = 1;
        while (i <= size) {
            System.out.print(".");
            i++;
        }
        // System.out.println(".");
    }

    private static void printStars(int amount) {
        int i = 1;
        while (i <= amount) {
            System.out.print("*");
            i++;
        }
        //System.out.println("*");
    }


    public static void main(String[] args) {
        pritnxmastree(7);

        //printStand(2);

    }
}

