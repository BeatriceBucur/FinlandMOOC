package week4.person;

public class Person {
    //fields
    private int age;
    private String name;


    //constructor
    public Person( String name){
        this.name = name;
        this.age = 0;
    }
    public void becomeOlder(){
        this.age++;
    }

    public int getAge(){
        return this.age;
    }

    public void printPerson(){
        System.out.println(this.name + " , age "+ this.age + " years");
    }




}
