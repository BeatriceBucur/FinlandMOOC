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
            int s = 50; //scanner.nextInt(); // read the initial value of seconds from the user
            System.out.print("minutes: ");
            int m = 59; //scanner.nextInt();// read the initial value of minutes from the user
            System.out.print("hours: ");
            int h = 23; //scanner.nextInt();// read the initial value of hours from the user

            seconds.setValue(s);
            minutes.setValue(m);
            hours.setValue(h);

            int i = 0;
            while ( i < 3910 ) {
                // like in previous but seconds taken into account
                System.out.println( hours + ":" + minutes + ":" + seconds);   // the current time printed
                //advance seconds
                seconds.next();

                //if seconds become zero, advance minutes
                if(seconds.getValue()==0){
                    minutes.next();
                }

                //if minutes become zero, advance hours
                if(minutes.getValue() ==0 && seconds.getValue()==0){
                    hours.next();
                }
                i++;
            }

        }

    }
