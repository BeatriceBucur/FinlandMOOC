package week4.clock;

import java.text.DecimalFormat;

import static java.lang.Character.FORMAT;

public class ex78ClockCounter2 {
    /*
    ---ex.78.1---
    Implement class BoundedCounter with the following functionality:

    A counter has an object variable that remembers the value of the counter.
    The value is within the range 0..upperBound
    In the beginning the value is 0.
    The upper bound of the value is defined by the constructor parameter.
    The method "next" increments the value of the counter.
    If the value would be more that the upper limit, it wraps around and becomes zero.
    The method toString returns a string representation of the counter value.


    Exercise 78.2: Printing the initial zero
    Improve toString so that if the value of the counter is less than 10, it prefixes the value with 0.
    If the value of the counter is e.g. 3, toString should produce "03".
    If the value is at least 10, e.g. 12, the returned string would be "12".

    A main program that demonstrates the desired functionality of the improved toString.
     */

    //fields
    int upperBound;
    int valueOfCounter;
    private final static String FORMAT = "00";

    public ex78ClockCounter2(int upperBound){
        this.upperBound = upperBound;
        this.valueOfCounter = 0;
    }

    public void next(){
        if( this.valueOfCounter<this.upperBound){
            valueOfCounter++;
        }else{
            valueOfCounter = 0;
        }
    }

    public String toString(){
        DecimalFormat fmt = new DecimalFormat(FORMAT);      // use at least 2 digits
        return fmt.format(valueOfCounter);


    }

}
