package week3.objectsAndArrayList;

import java.util.ArrayList;

public class ex64AverageOfNumbers {
        /*
    Create the method average, which receives a list of numbers (ArrayList<Integer>) as a parameter
    and then calculates the average of the items in that list.
    Note: the method should use the method sum from the previous exercise to calculate the sum of the parameters.
     */

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ceva = new ArrayList<>();
        ceva.add(3);
        ceva.add(3);
        ceva.add(4);
        double average = (double)sum(ceva) / ceva.size();
        System.out.println(average);
    }
}
