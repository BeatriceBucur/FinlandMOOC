package week3.objectsAndArrayList;

import java.util.ArrayList;

public class ex65LengthsOfStringVar3 {
    /*
    Create the method lengths that gets a list of String variables as a parameter and
    returns an ArrayList that contains the lengths of the Strings in the same order as the original list.
     */
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> listaMea = new ArrayList<Integer>();
        for ( String cuvant: list){
            listaMea.add(cuvant.length());
        }
        return listaMea;
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the Strings: " + lengths);
    }



}
