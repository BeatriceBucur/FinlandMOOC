package week4.clock;

public class Runner2 {
    /*
    Exercise 78.2: Printing the initial zero
    Improve toString so that if the value of the counter is less than 10, it prefixes the value with 0.
    If the value of the counter is e.g. 3, toString should produce "03".
    If the value is at least 10, e.g. 12, the returned string would be "12".

    A main program that demonstrates the desired functionality of the improved toString.
     */

    public static void main(String[] args) {
        ex78ClockCounter2 counter = new ex78ClockCounter2(14);
        System.out.println("Value at start: " + counter );

        int i = 0;
        while ( i < 16){
            counter.next();
            System.out.println("value: " + counter );
            i++;
        }
    }
}
