package week4.person;

public class Person {
    //fields
    private int age;
    private String name;
    private int weight;
    private int height;


    //constructor
    public Person( String name){
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public void setHeight(int newHeight){
        this.height = newHeight;
    }

    public void setWeight(int newWeight){
        this.weight = newWeight;
    }

    public double bodyMassIndex(){
        double heightDividedByHundred = this.height/100.0;
        return this.weight / (heightDividedByHundred* heightDividedByHundred);
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

    public boolean isAdult(){
        if(this.age>=18){
            return true;
        }
        return false;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
