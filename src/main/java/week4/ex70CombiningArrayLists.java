package week4;

import java.util.ArrayList;

public class ex70CombiningArrayLists {
    /*
    Create the method public static void combine(ArrayList<Integer> first, ArrayList<Integer> second)
    that inserts the items in a list called second to a list called first.
    The order of the items can be anything and the same item can appear in the list more than once.
     */

    public static void combine( ArrayList<Integer> first, ArrayList<Integer> second){
        first.addAll(second);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list2.add(2);
        list2.add(4);

        combine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);

    }


}
