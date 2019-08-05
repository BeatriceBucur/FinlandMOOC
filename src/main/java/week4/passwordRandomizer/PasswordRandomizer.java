package week4.passwordRandomizer;

import java.util.Random;

public class PasswordRandomizer {
    /*
    Your assignment is to expand the class PasswordRandomizer that has the following functionality:
    The constructor PasswordRandomizer creates a new object, which uses the given password length.
    The method createPassword returns a new password,
    which consists of symbols a-z and is of the length given as a parameter to the constructor

    pentru ca nu am gasit nimic mai util, am incercat sa fol. sursa asta:
    https://www.geeksforgeeks.org/generating-password-otp-java/
     */
    private int passwordLength;
    private Random random;
    private char symbol;
    private int number;


    public PasswordRandomizer(int passwordLength) {
        this.passwordLength = passwordLength;
        random = new Random();
    }

    public String createPassword() {
        String smallChars = "abcdefghijklmnopqrstuvwxyz";
        int bound = smallChars.length();
        char[] chars = new char[passwordLength];

        // for passwordLength select random char from smallChars and put it into chars
        // nextInt(5) -> 0 1 2 3 4


        for(int i = 0 ; i< chars.length ;i++){
            chars[i] = smallChars.charAt(random.nextInt(bound));
        }

        return new String(chars);
    }
}


