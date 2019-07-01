package week3.objectsAndArrayList;


import java.util.ArrayList;
import java.util.Scanner;

public class ex68MoreThanOnce {
    /*
    Create the method moreThanOnce that gets a list of integers and an integer (i.e. number) as parameter.
    If the number appears on the list more than once the method returns true and otherwise false.
     */

    public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
        int occurs = 0;
        for( int n : list){
            if( n == number){
                occurs++;
            }
        }
        return occurs>1;
        }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once.");
        }
    }
}

