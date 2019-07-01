package week4;

import java.util.ArrayList;

public class ex71SmartCombining {
    /*
    Create the method smartCombine that works like the previous combine method
    except that numbers can be on the list only once.
    This means that the method adds a new number to the list only if the list does not already contain that number.
    You might find the method contains from the ArrayList class useful.
    You can use that method to check if a number is in the list.
     */

    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second){
        for (Integer num:second)
        {
            if(!first.contains(num)){
                first.add(num);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(22);
        list1.add(33);
        list2.add(22);
        list2.add(4);

        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);

    }
}
