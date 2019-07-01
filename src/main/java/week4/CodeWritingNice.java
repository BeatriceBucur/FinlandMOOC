package week4;

import java.util.ArrayList;

public class CodeWritingNice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(3);
        numbers.add(7);
        numbers.add(3);
        System.out.println("the numbers in the beginning: ");

        //here we print numbers
        for(int number : numbers){
            System.out.println(number);
        }

        //check if the list contains number 3;
        while(numbers.contains(Integer.valueOf(3))){
            numbers.remove(Integer.valueOf(3)); // if yes, it is removed
        }

        System.out.println("numbers after removal: ");

        //here we print the numbers

        for (int number: numbers){
            System.out.println(number);
        }
    }


}
