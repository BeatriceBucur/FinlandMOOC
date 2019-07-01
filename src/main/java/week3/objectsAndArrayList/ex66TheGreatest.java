package week3.objectsAndArrayList;

import java.util.ArrayList;

public class ex66TheGreatest {
    /*
    Create the method greatest, which receives
    a list of numbers (ArrayList<Integer>) as a parameter
    and then returns the greatest number in the list as a return value.
     */

    public static int greatest(ArrayList<Integer> numbers) {
        int max = 0;

        for (int i = 0; i < numbers.size() - 1; i++) {

            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ceva = new ArrayList<>();
        ceva.add(3);
        ceva.add(2);
        ceva.add(1);
        ceva.add(4);
        ceva.add(7);
        ceva.add(8);
        ceva.add(5);
        ceva.add(6);
        System.out.println("our greatest number in the list is: " + greatest(ceva));
    }

}
