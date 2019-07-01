package week4;

import java.util.ArrayList;

public class CodeWritingNicer {
    public static void print(ArrayList<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void remove(ArrayList<Integer> numbers, int removed) {
        while (numbers.contains(Integer.valueOf(3))) {
            numbers.remove(Integer.valueOf(removed));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(3);

        System.out.println("print numbers in the begining");
        print(list);

        remove(list, 3);

        System.out.println("print numbers after removal ");
        print(list);
    }
}


