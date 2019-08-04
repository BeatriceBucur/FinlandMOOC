package week4.numberStatistics;

import java.util.Scanner;

public class RunnerStatistics3 {
    public static void main(String[] args) {
        NumberStatistics allStats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your numbers: ");
        int ceva = Integer.parseInt(scanner.nextLine());
        while(ceva > 0){
            if(ceva%2 ==0){
                evenStats.addNumber(ceva);
            }else{
                oddStats.addNumber(ceva);
            }
            allStats.addNumber(ceva);
            ceva = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Sum of numbers is: " + allStats.sumOfNumbers());
        System.out.println("average is: " + allStats.average());
        System.out.println("sum of even is: " + evenStats.sumOfNumbers());
        System.out.println("sum of odd is: " +oddStats.sumOfNumbers());
    }
}
