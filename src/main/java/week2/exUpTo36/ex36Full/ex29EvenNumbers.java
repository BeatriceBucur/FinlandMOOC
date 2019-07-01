package week2.exUpTo36.ex36Full;

public class ex29EvenNumbers {
    /*
    Create a program that prints all even numbers between 2 and 100.
     */

    public static void main(String[] args) {
        int i = 1;

        while(i<101){
            if(i%2==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
