package week3.objectsAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ex61AmountOfItemsInAList {
    /*
    Create the method public static int countItems(ArrayList<String> list)
    that returns the number of the items in the list.
    Your method should not print anything.
    Use a return statement to return the number as shown in the following example:
     */

    public static int countItems(ArrayList<String> list) {
        return list.size();
    }

    public static void printItems(ArrayList<String> list) {
        for (String chestie : list)
            System.out.print(chestie+" ");
    }

    public static void removeFirst(ArrayList<String> list) {
        list.remove(0);
    }

    public static void removeLast(ArrayList<String> list){
       list.remove(list.size()-1);
    }

    public static void addItems(ArrayList<String> list) {
        Scanner scanner = new Scanner(System.in);

        boolean adaugaItemi = false;
        while (!adaugaItemi) {
            System.out.println("adauga un nou element in lista: ");
            String input = scanner.nextLine();

            if(input.isEmpty()){
                return;
            }else{
                list.add(input);
            }
        }
    }

        public static void main (String[]args){
            ArrayList<String> ceva = new ArrayList<>();
            ceva.add("java");
            ceva.add("mimi");
            ceva.add("zozo");
            ceva.add("gigi");
            ceva.add("toto");
            System.out.println("lista contine urmatoarele " + countItems(ceva) + " elemente:");
            printItems(ceva);


            removeFirst(ceva);
            System.out.println(" ");
            System.out.println("noua lista ( dupa remove first) contine urmatoarele: " + countItems(ceva) + " elemente");
            printItems(ceva);
            System.out.println(" ");


            addItems(ceva);
            System.out.println("noua lista ( dupa add) contine urmatoarele:  " + countItems(ceva) + " elemente");
            printItems(ceva);


            removeLast(ceva);
            System.out.println(" ");
            System.out.println("noua lista ( dupa remove last) contine urmatoarele: " + countItems(ceva) + " elemente");
            printItems(ceva);
        }
}
