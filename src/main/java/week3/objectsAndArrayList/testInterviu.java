package week3.objectsAndArrayList;

import java.util.Scanner;

public class testInterviu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type a really messed up string here: ");
        String someString = scanner.nextLine();

        int countDuplicateOccurences = 0;

        for (int i = 0; i < someString.length(); i++) {
            for (int j = 0; j < someString.length(); j++) {


                if (someString.charAt(i) == someString.charAt(j)) {
                    countDuplicateOccurences++;

                }

            }

            System.out.println(someString.charAt(i)+"  ---  "+countDuplicateOccurences);
            String newResult = String.valueOf(someString.charAt(i)).trim();
           // String newResult = someString.replaceAll(newResult,".");
            //messedString=messedString.replaceAll(newResult,"");
            //distinct = 0;


        }

    }
}


