package week3.objectsAndArrayList;

import java.util.ArrayList;

public class ex67Median {
    /*
    exercitiul original este cu variance.
    eu o sa fac cu mediana pentru numere pare si impare ca pot sa inteleg formula pe care o am de aplicat.
     */
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    public static int average(ArrayList<Integer> numbers) {
        int average = 0;
        for (int number : numbers) {
            average = sum(numbers) / numbers.size();
        }
        return average;

    }

    public static void main(String[] args) {
        ArrayList<Integer> testMediana = new ArrayList<>();
        testMediana.add(76);
        testMediana.add(22);
        testMediana.add(44);
        testMediana.add(15);
        testMediana.add(20);
        System.out.println("suma numerelor din testMediana este: " + sum(testMediana));
        if (sum(testMediana) % 2 == 0) {
            System.out.println("suma este para");
            System.out.println("calculeaza mediana pentru o lista cu pozitii impare");

            int mediana = ((sum(testMediana) / 2) - 1);
            System.out.println("mediana celor " + testMediana.size() + " numere este " + mediana);
        } else {
            System.out.println("suma este impara");
            System.out.println("mediana celor " + testMediana.size() + " numere este " + average(testMediana));

        }
    }
}
