package week1.exUpTo12;

import java.util.Scanner;

import static java.lang.Math.PI;

public class ex10CalculatingCircumf {
    /*
    The circumference of a circle is calculated using the formula 2 * pi * radius.
    Create a program that asks the user for the radius and then calculates the
    circumference using the given radius.
    Java already contains the value of pi in the Math.PI variable,
    which you can use in your calculation.
    ---
    Type the radius: 20

    Circumference of the circle: 125.66370614359172

    ---
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type the radius: ");
        int radius = scanner.nextInt();
        double circumference = (double)2*PI*radius;
        System.out.println("Circumference of the circle: " + circumference);
    }

}
