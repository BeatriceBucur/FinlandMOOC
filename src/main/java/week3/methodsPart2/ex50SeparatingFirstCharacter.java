package week3.methodsPart2;

import java.util.Scanner;

public class ex50SeparatingFirstCharacter {
    /*
    Create a program that asks for the user's name and gives its first, second and third characters separately.
     If the name length is less than three, the program prints nothing.
     You do not need to create methods in this exercise.
     Type your name: Paul
        1. character: P
        2. character: a
        3. character: u

        Note: watch closely at the output in this and the following exercise.
        The print needs to contain a space after the dot and the colon!
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = scanner.nextLine();
        int i = 0;
        while((i<3)&& name.length()>3){

                System.out.println((i+1)+". "+"character: " + name.charAt(i));
                i++;
            }

        }
    }

