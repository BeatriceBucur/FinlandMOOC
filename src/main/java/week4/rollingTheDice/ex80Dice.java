package week4.rollingTheDice;

import java.util.Random;

public class ex80Dice {
    private Random random;
    private int numberOfSides;

    public ex80Dice(int numberOfSides){
        this.numberOfSides = numberOfSides;
        random  = new Random();
    }

    public int roll(){
        return random.nextInt(numberOfSides-1)+1;
    }
}
