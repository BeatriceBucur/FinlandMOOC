package week3.methodsPart2;

public class ex44Least {
    /*
    Create the method least, which returns the least of the numbers given as parameters.
    If the parameters are equal, you can decide which one is returned.

    --output--
    Least: 2
     */

    public static int least(int number1, int number2){
        if(number1<number2){
            return  number1;
        }else if (number1>number2){
            return number2;
        }else{
            return number1;
        }
    }

    public static void main(String[] args) {
        int answer  = least(2,7);
        System.out.println("Least: " + answer);
    }
}
