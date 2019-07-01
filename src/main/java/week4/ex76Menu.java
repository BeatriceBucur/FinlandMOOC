package week4;

import java.util.ArrayList;

public class ex76Menu {
    /*
    In this assignment, we will implement a class Menu
    that holds information about meals that are available in a cafeteria.
    Menu objects store the information of meals using an object variable of type ArrayList<String>

    Exercise 76.1: Adding a meal to menu
    Implement the method public void addMeal(String meal) that adds a new meal to the list
     this.meals of a Menu object.
    If the meal is already in the list, it should not be added.

    Exercise 76.2: Printing the menu
    Implement the method public void printMeals() that prints the meals in a menu.
    As an example, the output after three additions could be:
    Hamburger
    Fish'n'Chips
    Sauerkraut


    Exercise 76.3: Clearing a menu
    Implement the method public void clearMenu() that clears a menu.
    After calling this method, the menu should be empty.
    Class ArrayList has a method that is useful here.
    Within your method body write meals. and see how NetBeans helps you by showing
    the available methods.
     */

    private ArrayList<String> meals;


    public ex76Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!meals.contains(meal)){
            this.meals.add(meal);
        }
    }

    public void printMeals(){
            for( String meal : meals){
            System.out.println(meal);
        }
    }

    public void clearMenu(){
        System.out.println("printez din interiorul lui clearMenu");
        meals.clear();
    }

    public void removeSingleMenu(String meal){
        System.out.println("printez din interiorul lui removeSingleMenu");
        meals.remove(meal);
    }

    @Override
    public String toString() {
        return "ex76Menu{" +
                "meals=" + meals +
                '}';
    }

    public static void main(String[] args) {
        ex76Menu meniulMeu  = new ex76Menu();

        meniulMeu.addMeal("papa bun");
        meniulMeu.addMeal("yummie food");
        meniulMeu.addMeal("papa bun");

        meniulMeu.printMeals();

        meniulMeu.removeSingleMenu("papa bun");
        meniulMeu.printMeals();
    }
}



