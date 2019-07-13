package week4.clock;

public class ex78ClockCounter {
    /*
    Implement class BoundedCounter with the following functionality:

    A counter has an object variable that remembers the value of the counter.
    The value is within the range 0..upperBound
    In the beginning the value is 0.
    The upper bound of the value is defined by the constructor parameter.
    The method "next" increments the value of the counter.
    If the value would be more that the upper limit, it wraps around and becomes zero.
    The method toString returns a string representation of the counter value.
     */

    private int valueOfCounter;
    private int upperBound;

    public ex78ClockCounter(int upperBound) {
        this.upperBound = upperBound;
        this.valueOfCounter = 0;
    }

    public void next() {

        if  (this.valueOfCounter < this.upperBound) {
                valueOfCounter++;
            } else{
                valueOfCounter =0;
            }
        }

    public String toString(){
        return " " + valueOfCounter;

    }
}
