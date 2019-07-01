package week3.methodsPart2;

public class ex45Greatest {

    /*
    Create the method greatest, which gets three integers as parameters and then returns the greatest of them.
    If there are several parameters that are equally great, you can decide which one is returned.
    Printing should be done in the main program.
     */

    public static int greatest( int number1, int number2, int number3){
        if(number1>number2 && number1>number3){
            return number1;
        } else if ( number2>number1 && number2>number3){
            return number2;
        }else if ( number3>number1 && number3> number2){
            return number3;
        } else{
            return number1;
        }
    }

    public static void main(String[] args) {
        int answer  = greatest(12,18,9);
        System.out.println("Greatest is: " + answer);
    }
}
