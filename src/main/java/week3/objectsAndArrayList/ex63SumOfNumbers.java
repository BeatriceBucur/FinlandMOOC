package week3.objectsAndArrayList;

import java.util.ArrayList;

public class ex63SumOfNumbers {
    /*
    Create the method sum, which receives a list of numbers (ArrayList<Integer>)
    as a parameter and then calculates the sum of the items in that list.
     */

    public static int sum(ArrayList<Integer> list){
        /*
        //Varianta cu FOR

        int sum = 0;
        for ( int i = 0; i<list.size(); i++){
            sum = sum + list.get(i);
        }
        return sum;
        */

        int sum = 0;
        for(int numar : list){
            sum +=numar;
        }
        return sum;

    }

    public static void main(String[] args) {
      ArrayList<Integer> sumaMea = new ArrayList<>();
      sumaMea.add(2);
      sumaMea.add(3);
      sumaMea.add(4);
      System.out.println(sum(sumaMea));
    }


}
