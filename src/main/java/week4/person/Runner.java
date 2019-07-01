package week4.person;

public class Runner {

    public static void main(String[] args) {
        Person mimi = new Person("mimi");

        Person titi = new Person ("titi");
        Person gigi = new Person ( "gigi");

        mimi.printPerson();
        gigi.printPerson();

        gigi.becomeOlder();
        gigi.becomeOlder();
        gigi.becomeOlder();
        mimi.becomeOlder();
        mimi.becomeOlder();

        System.out.println("age of mimi " + mimi.getAge());
        System.out.println("age of gigi " + gigi.getAge());

        int total = mimi.getAge() + gigi.getAge();

        System.out.println("mimi si gigi au in total " + total + " ani");



    }
}
