package week4;

public class ex73Product {

/*
Create a class Product that represents a product sold in a webshop. A product has a price, amount and name.
The class should have:

A constructor public Product(String nameAtStart, double priceAtStart, int amountAtStart)
A method public void printProduct() that prints a product in the following form:
Banana, price 1.1, amount 13

 */

    // fields
    private double priceAtStart;
    private int amountAtStart;
    private String nameAtStart;

    //constructor
    public ex73Product(String nameAtStart, double priceAtStart, int amountAtStart){
        this.nameAtStart = nameAtStart;
        this.priceAtStart = priceAtStart;
        this.amountAtStart  = amountAtStart;
    }

    //method
    public void printProduct(String nameAtStart, double priceAtStart, int amountAtStart){
        System.out.println(nameAtStart +", "+ "price " + priceAtStart+",  "+ "amount " + amountAtStart);
    }

    public static void main(String[] args) {
        ex73Product ceva = new ex73Product("banana", 1.1, 13);
        ceva.printProduct("banana", 1.1, 13);
    }


}
