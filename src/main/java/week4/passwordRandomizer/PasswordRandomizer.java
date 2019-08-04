package week4.passwordRandomizer;

import java.util.Random;

public class PasswordRandomizer {
    /*
    Your assignment is to expand the class PasswordRandomizer that has the following functionality:
    The constructor PasswordRandomizer creates a new object, which uses the given password length.
    The method createPassword returns a new password,
    which consists of symbols a-z and is of the length given as a parameter to the constructor
     */
    private int passwordLength;
    private Random random;
    private char symbol;
    private int number;


    public PasswordRandomizer(int passwordLength) {
        this.passwordLength = passwordLength;
        random = new Random();
    }

    public char[] createPassword() {
       String  smallChars = "abcdefghijklmnopqrstuvwxyz";
       String values = smallChars;
       Random random  = new Random();
       char[] password = new char[passwordLength];
       for ( int i = 0; i < passwordLength; i++){
           password[i] = values.charAt(random.nextInt(passwordLength));
       }
        return password;
    }
}

