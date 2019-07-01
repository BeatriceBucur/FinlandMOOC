package week1.exUpTo24;

import java.util.Scanner;

public class ex18GradesAndPoints {
    /*
    Create a program that gives the course grade based on the following table.

    Points	Grade
    0–29	failed
    30–34	1
    35–39	2
    40–44	3
    45–49	4
    50–60	5
    --Example outputs:
    Type the points [0-60]: 37
    Grade: 2
    --Example outputs:
    Type the points [0-60]: 51
    Grade: 5
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type the points [0 - 60]: ");
        int points = scanner.nextInt();

        if(points>=30 && points <=34){
            int grade = 1;
            System.out.println("grade: " + grade);
        } else if(points >=35 && points <=39){
            int grade = 2;
            System.out.println("grade: " + grade);
        } else if(points >=40 && points <=44){
            int grade = 3;
            System.out.println("grade: " + grade);
        } else if(points>=45 && points<=49){
            int grade = 4;
            System.out.println("grade: " + grade);
        } else if( points>=50 && points<=60){
            int grade = 5;
            System.out.println("grade: " + grade);
        }else{
            System.out.println("failed");
        }
    }
}
