package week4.clock;

import java.text.DecimalFormat;

public class ex78ClockCounter3 {
    /*
    Exercise 78.3: The first version of the clock
    With two counter objects it possible for us to build a simple clock.
    Hours can be represented by a counter with upper bound 23 and minutes by a counter with upper bound 59.
    As we all know, when minutes wrap around from 59 to 0, hours advance by one.
    First you should implement the method getValue for the counters in the class:
    public int getValue() {
    // write here code that returns the value
}
     */
    //fields
    int upperBound;
    int valueOfCounterMinutes;
    int valueOfCounterHours;
    private final static String FORMAT = "00";

    public ex78ClockCounter3(int upperBound){
        this.upperBound = upperBound;
        this.valueOfCounterMinutes = 0;
        this.valueOfCounterHours = 0;
    }

    public void next(){
        if(this.valueOfCounterMinutes<upperBound){
            valueOfCounterMinutes++;
        }else if(this.valueOfCounterMinutes>=upperBound){
            valueOfCounterMinutes = 0;
            valueOfCounterHours++;
        }
    }

    public int getValue(){
        return this.valueOfCounterHours;
    }

    public String toString(){
        DecimalFormat fmt = new DecimalFormat(FORMAT);      // use at least 2 digits
        return fmt.format(valueOfCounterMinutes);


    }







}
