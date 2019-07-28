package week4.numberStatistics;

import java.util.ArrayList;

public class NumberStatistics {

    /*
    Implement class NumberStatistics with the following methods:

     - addNumber adds a new number to the statistics
     - amountOfNumbers tells us how many numbers have been added to the statistics

    Note that the class should not store the added numbers.
    At this stage, it is enough to remember how many added numbers there are,
    i.e. how many times the method addNumber has been called.
     */

    private int amountOfNumbers;
    private int sum;


    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;

    }

    public void addNumber(int number) {
        if (number != 0) {
            this.sum = this.sum + number;
        }
        this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sumOfNumbers() {
        return sum;
    }

    public double average(){
        double average = (double) sum/(double) amountOfNumbers;
        return average;
    }
}
