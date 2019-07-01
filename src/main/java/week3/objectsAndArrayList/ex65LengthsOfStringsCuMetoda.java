package week3.objectsAndArrayList;

import java.util.ArrayList;

public class ex65LengthsOfStringsCuMetoda {
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

    public static ArrayList<Integer> lungimeCuvant(ArrayList<String> cuvinte) {
        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (String cuvant : cuvinte) {
            lista.add(cuvant.length());
        }
        return lista;
    }

    public static void main(String[] args) {
        ArrayList<String> words = addWordsToList("unu", "doi", "trei");
        System.out.println("cuvintele adaugate sunt: " + addWordsToList("unu", "doi", "trei"));
        System.out.println("lungimea fiecarui cuvant este: " + lungimeCuvant(words));
    }
}

