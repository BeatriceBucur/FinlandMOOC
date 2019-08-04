package week4.randomness;

import java.util.Random;

public class Randomizer {
    public static void main(String[] args) {
        Random randomizer = new Random(); // creates a random number generator
        int i = 0;

        while (i < 10) {
            // Generates and prints out a new random number on each round of the loop
            System.out.println(randomizer.nextInt(10));
            i++;
        }
    }
}
