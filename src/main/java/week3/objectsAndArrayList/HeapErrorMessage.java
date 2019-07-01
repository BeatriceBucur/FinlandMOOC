package week3.objectsAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class HeapErrorMessage {
    public static void main(String[] args) {
        ArrayList<String>  ceva = new ArrayList<>();
        ceva.add("mimi");

        Scanner scanner = new Scanner( System.in);
        System.out.println("scrie ceva aici: ");
        String input = scanner.nextLine();
        while(!input.isEmpty()){
            ceva.add(input);
        }

    }
}
