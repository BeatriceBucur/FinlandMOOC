package week4.clock;

import java.util.Scanner;

public class Runner4 {
    /*
    Exercise 78.4: The second version of the clock
    Firstly implement the method setValue to the class BoundedCounter.
    The method should set the value of the parameter to the counter
    unless the parameter is less than zero or larger than the upper bound.
    In those cases, the method does not have any effect.
    Then add a seconds counter to your clock.
    Ensure that all works as expected when starting e.g. with time 23:59:50.

     The output should be:
     */
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        ex78ClockCounter4 seconds = new ex78ClockCounter4(59);
        ex78ClockCounter4 minutes = new ex78ClockCounter4(59);
        ex78ClockCounter4 hours = new ex78ClockCounter4(23);

        System.out.print("seconds: ");
        int s = scanner.nextInt(); // read the initial value of seconds from the user
                System.out.print("minutes: ");
        int m = scanner.nextInt();// read the initial value of minutes from the user
                System.out.print("hours: ");
        int h = scanner.nextInt();// read the initial value of hours from the user

        seconds.setValueOfCounterSeconds(s);
        minutes.setValueOfCounterMinutes(m);
        hours.setValueOfCounterHours(h);

        int i = 0;
        while ( i < 121 ) {
            // like in previous but seconds taken into account
            System.out.println( h + ":" + m + ":" + s);   // the current time printed
            //advance seconds
            seconds.next();

            //if seconds become zero, advance minutes
            if(seconds.valueOfCounterSeconds==0){
                minutes.next();
            }

            //if minutes become zero, advance hours
            else if(minutes.valueOfCounterMinutes ==0){
                hours.next();
            }
            i++;
        }

    }

}
