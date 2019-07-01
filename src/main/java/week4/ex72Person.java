package week4;

public class ex72Person {
    //fields ( they are generally private)
    private String name;
    private int age;

    //constructor (is always public and has the same name as the class)
    public ex72Person(String nameAtStart, int ageAtStart){
        this.name = nameAtStart;
        this.age  = ageAtStart;
    }

    //methods
    public void printPerson(){
        System.out.println(this.name + " age " + this.age + " years ");
    }

    public static void main(String[] args) {
        ex72Person mimi = new ex72Person("mimi", 2);
        ex72Person gigi = new ex72Person("gigi", 20);
        ex72Person titi = new ex72Person("titi", 80);

        mimi.printPerson();
        gigi.printPerson();
        titi.printPerson();
    }


}
