package week2.methodsPart1;

import java.util.Scanner;

public class ex38ManyPrints {
    /*
    Develop the program by adding the following feature:
    the main program should ask the user how many times the text should be printed
   (meaning how many times the method is called).

    public static void main(String[] args) {
    // ask the user how many times the text should be printed
    // use the while structure to call the printText method several times
    }

    public static void printText() {
    // write your code here
    }

    --expected output--
    How many?
    3
    In the beginning there were the swamp, the hoe and Java.
    In the beginning there were the swamp, the hoe and Java.
    In the beginning there were the swamp, the hoe and Java.
     */

    public static void main(String[] args) {
        // ask the user how many times the text should be printed
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many?");
        int howMany = scanner.nextInt();
        // use the while structure to call the printText method several times
        int i=1;
        while(i<=howMany){
            printText();
            i++;
        }
    }

    public static void printText() {
        // write your code here
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }


}
