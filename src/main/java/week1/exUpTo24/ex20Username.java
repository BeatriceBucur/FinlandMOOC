package week1.exUpTo24;

import java.util.Scanner;

public class ex20Username {
    /*
    Create a program that recognizes the following users:
    Username	Password
    alex	    mightyducks
    emily	    cat
    The program should check for the username and password as follows:

    Type your username: alex
    Type your password: mightyducks
    You are now logged into the system!

    Type your username: emily
    Type your password: cat
    You are now logged into the system!

    Type your username: emily
    Type your password: dog
    Your username or password was invalid!
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your username: ");
        String username = scanner.nextLine();
        System.out.println("Type your password: ");
        String password = scanner.nextLine();
        if( (username.equals("alex"))&&(password.equals("mightyducks")) ||
                ((username.equals("emily"))&&(password.equals("cat")))){
            System.out.println("You are now logged into the system!");
        }else{
            System.out.println("Your username or password was invalid!");
        }
    }
}

