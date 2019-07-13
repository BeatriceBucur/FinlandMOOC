package week4.clock;

public class Runner3 {
    public static void main(String[] args) {
        ex78ClockCounter3 minutes = new ex78ClockCounter3(59);
        ex78ClockCounter3 hours = new ex78ClockCounter3(23);

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes);   // the current time printed
            // advance minutes
            minutes.next();
            // if minutes become zero, advance hours
            if(minutes.valueOfCounterMinutes == 0) {
                hours.next();
            }
            i++;
        }
    }
}
