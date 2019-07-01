package week3.objectsAndArrayList;

import java.util.ArrayList;

public class ex65LengthsOfStringsFaraMetoda {
    /*
    Create the method lengths that gets a list of String variables as a parameter
    and returns an ArrayList that contains the lengths of the Strings in the same order as the original list.
     */


    public static ArrayList<String> addWordsToList(String word1, String word2, String word3) {
        ArrayList<String> listaInitiala = new ArrayList<>();
        listaInitiala.add(word1);
        listaInitiala.add(word2);
        listaInitiala.add(word3);
        return listaInitiala;
    }

    public static void main(String[] args) {
        ArrayList<String> cuvinte = addWordsToList("unu", "doi", "trei");
        int lungimeCuvant = 0;
        for (String cuvant : cuvinte) {
            lungimeCuvant = cuvant.length();
            System.out.println(lungimeCuvant);
        }
    }
}

