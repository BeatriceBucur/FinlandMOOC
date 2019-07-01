package metode;

import java.sql.Connection;
import java.util.Scanner;

public class Runner {
    private Connection c;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;


// WRITE YOUR PROGRAM HERE
// USE ONLY THE VARIABLES sum, reader AND read!
       int myNumber;
        Runner r = new Runner();
         r.afiseazaDublulNumarului(56);
        myNumber = r.returneazaTriplullNumarului(5);

        System.out.println(myNumber);
    }

    private void afiseazaDublulNumarului(int numar){
        System.out.println(numar * 2);
    }

    private int returneazaTriplullNumarului(int numar){
        return numar * 3;
    }

}
