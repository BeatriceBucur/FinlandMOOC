package week4.lottery;


import java.util.ArrayList;
import java.util.Random;


public class LotteryNumbers {
    /*
    Your assignment is to expand the class LotteryNumbers, which draws the lottery numbers of the week.
    The numbers of the week consist of 7 different numbers between 1 and 39.
    The class has the following functionality:

     - the constructor LotteryNumbers creates a new LotteryNumbers object, which contains the new drawn numbers
     - the method numbers returns the drawn numbers of this draw
     - the method drawNumbers draws new numbers
     - the method containsNumber reveals if the number is among the drawn numbers
     */

    public ArrayList<Integer> numbers;
    Random random = new Random();

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // Write the number drawing here using the method containsNumber()
        this.numbers = new ArrayList<>();

        while (this.numbers.size() < 6) {
            int result = this.random.nextInt(39);
            if (!this.containsNumber(result)) {
                this.numbers.add(result);
            }
        }
    }


    public boolean containsNumber(int number) {
        // Test here if the number is already among the drawn numbers

        if (this.numbers.contains(number)|| this.numbers.contains(0)) {
            return true;
        } else {
            return false;
        }
    }
}







    /*
    public boolean containsNumber(int number) {
        // Test here if the number is already among the drawn numbers

        return true;
    }
    */








