package week4.person;

public class Runner {

    public static void main(String[] args) {
        Person mimi = new Person("mimi");

        Person titi = new Person ("titi");
        Person gigi = new Person ( "gigi");
        Person lili = new Person ("lili");

        titi.setHeight(180);
        titi.setWeight(80);

        lili.setHeight(175);
        lili.setWeight(60);

        System.out.println(titi.getName() + " , body mass index: " + String.format("%.2f" , titi.bodyMassIndex()));
        System.out.println(lili.getName() + " , body mass index: " + String.format("%.2f" , lili.bodyMassIndex()));

        mimi.printPerson();
        gigi.printPerson();

        gigi.becomeOlder();
        gigi.becomeOlder();
        gigi.becomeOlder();
        mimi.becomeOlder();
        mimi.becomeOlder();

        System.out.println("age of mimi is " + mimi.getAge() + "  years old");
        System.out.println("age of gigi is " + gigi.getAge()+ "  years old");

        int total = mimi.getAge() + gigi.getAge();

        System.out.println("mimi si gigi au in total " + total + " ani");

        //varianta cu boolean ( isAdult)
        if( gigi.isAdult()){
            System.out.print("adult: ");
            gigi.printPerson();
        }else{
            System.out.print("minor: ");
            gigi.printPerson();
        }
        if( mimi.isAdult()){
            System.out.print("adult: ");
            mimi.printPerson();
        }else{
            System.out.print("minor: ");
            mimi.printPerson();
        }

        //varianta cu .getName
        if(mimi.isAdult()){
            System.out.println(mimi.getName() + "is an adult");
        }else{
            System.out.println(mimi.getName()+ " is a minor");
        }

        //varianta cu toString
        if ( mimi.isAdult()){
            System.out.println(mimi + "is an adult");
        }else{
            System.out.println(mimi + " is a minor");
        }






    }
}
