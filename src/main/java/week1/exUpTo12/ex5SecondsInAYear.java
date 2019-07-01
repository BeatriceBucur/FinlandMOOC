package week1.exUpTo12;

public class ex5SecondsInAYear {
    /*
    Create a program that counts how many seconds there are in a year.
    You can assume that a year consists of 365 days (therefore the year is not a leap year).
    The program should print the following:
    "There are X seconds in a year."
    X should be replaced with the calculation of your program.

     */
    public static void main(String[] args) {
        double secondsInAnYear;
        double year = 365.25;
        int hours = 24;
        int seconds = 3600;
        secondsInAnYear = (year*hours*seconds);
        System.out.println("There are "+secondsInAnYear+ " seconds in an year");
    }

}
