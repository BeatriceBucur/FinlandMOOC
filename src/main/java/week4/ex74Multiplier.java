package week4;

public class ex74Multiplier {
    /*
    Implement the class Multiplier that has:

    a constructor public Multiplier(int number).
    a method public int multiply(int otherNumber) that returns otherNumber multiplied by number
     (i.e., the constructor parameter).
     */

    //fields
    private int number;
    private int otherNumber;

    //constructor

    public ex74Multiplier(int number){
        this.number = number;
    }

    //method
    public int multiply(int otherNumber){
        return this.otherNumber = otherNumber*number;
    }


    public static void main(String[] args) {
        ex74Multiplier threeMultiplier = new ex74Multiplier(3);

        System.out.println("threeMultiplier.multiply(2):  "+ threeMultiplier.multiply(2));

        ex74Multiplier fourMultiplier = new ex74Multiplier(4);
        System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));

        System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
        System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));
    }





}
