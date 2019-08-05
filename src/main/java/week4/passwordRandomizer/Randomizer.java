package week4.passwordRandomizer;

public class Randomizer {
    public static void main(String[] args) {

            PasswordRandomizer randomizer =  new PasswordRandomizer(13);
            System.out.println("Password: " + randomizer.createPassword());
            System.out.println("Password: " + randomizer.createPassword());
            System.out.println("Password: " + randomizer.createPassword());
            System.out.println("Password: " + randomizer.createPassword());
        }

    }

