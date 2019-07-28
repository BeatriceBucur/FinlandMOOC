package week4.clock;

import java.text.DecimalFormat;

public class ex78ClockCounter4 {
    /*
    Firstly implement the method setValue to the class BoundedCounter.
    The method should set the value of the parameter to the counter
    unless the parameter is less than zero or larger than the upper bound.
    In those cases, the method does not have any effect.

    Then add a seconds counter to your clock. The clock should now be as follows:
     */

    //fields
    int valueOfCounterSeconds;
    int valueOfCounterMinutes;
    int valueOfCounterHours;
    int upperBound;
    private final static String FORMAT = "00";


    //constructor
    public ex78ClockCounter4(int upperBound) {
        this.upperBound = upperBound;
        this.valueOfCounterSeconds = 0;
        this.valueOfCounterMinutes = 0;
        this.valueOfCounterHours = 0;
    }


    //methods
    public void setValueOfCounterSeconds(int valueOfCounterSeconds) {
        if (!(this.valueOfCounterSeconds >= upperBound && this.valueOfCounterSeconds < 0)) {
            this.valueOfCounterSeconds = valueOfCounterSeconds;
        }
    }

        public void setValueOfCounterMinutes ( int valueOfCounterMinutes) {
            if (!(this.valueOfCounterMinutes >= upperBound && this.valueOfCounterMinutes < 0)) {
                this.valueOfCounterMinutes = valueOfCounterMinutes;
            }
        }

        public void setValueOfCounterHours ( int valueOfCounterHours){
            this.valueOfCounterHours = valueOfCounterHours;
        }

    /*
        public void next(){
            if(!(this.valueOfCounterSeconds>=upperBound && this.valueOfCounterSeconds<0)){
                valueOfCounterSeconds++;
            }
        }
    */
        public void next () {
            if (this.valueOfCounterSeconds < upperBound) {
                valueOfCounterSeconds++;
            } else if(this.valueOfCounterMinutes<upperBound){
                valueOfCounterSeconds = 0;
                valueOfCounterMinutes++;
            } else if(this.valueOfCounterHours<upperBound){
                valueOfCounterSeconds=0;
                valueOfCounterMinutes =0;
                valueOfCounterHours++;
            }
        }
/*
        public int getValueOfCounterHours () {
            return valueOfCounterHours;
        }

        public int getValueOfCounterSeconds () {
            return valueOfCounterSeconds;
        }

        public int getValueOfCounterMinutes () {
            return valueOfCounterMinutes;
        }

 */

        public String toString () {
            DecimalFormat fmt = new DecimalFormat(FORMAT);      // use at least 2 digits
            return fmt.format(valueOfCounterMinutes);
        }
    }

