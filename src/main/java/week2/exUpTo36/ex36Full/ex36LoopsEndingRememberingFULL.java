package week2.exUpTo36.ex36Full;

import java.util.Scanner;

public class ex36LoopsEndingRememberingFULL {
        /*
        FUll Exercise 36.
            */
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("enter a series of numbers and (-1) to quit: ");
            int sum = 0;
            int count = 0;
            int oddCount = 0;
            int evenCount = 0;

            while (true) {
                int numbers = Integer.parseInt(scanner.nextLine());
                if (numbers > 0) {
                    sum += numbers;
                    count++;
                    if(numbers%2==0){
                        evenCount++;
                    }else{
                        oddCount++;

                    }
                }

                if (numbers < 0) {
                    System.out.println("Thank you and see you later!");
                    break;
                }
            }
            System.out.println("the sum is: " + sum);
            System.out.println("how many positive numbers: " + count);
            System.out.println("average: " + (double)sum/count);
            System.out.println("even numbers: " + evenCount);
            System.out.println("odd numbers: "+ oddCount);
        }


    }

