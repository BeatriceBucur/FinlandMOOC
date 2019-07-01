package week4;

public class ex77LyyraCard {
    /*
    The University of Helsinki students use a so-called Lyyra cards to pay for their meals in student cafeterias.
    In this assignment, we implement the class LyyraCard that simulates the Lyyra card.

    Exercise 77.1: Class skeleton
    Start by adding the class LyyraCard to your project.

    Then implement the LyyraCard constructor that gets the starting balance of the card as parameter.
    The card saves the balance in the object variable balance.
    Implement also the toString method that returns a string of the form "The card has X euros".

    Exercise 77.2: Paying with card
    Implement the following methods to LyyraCard:

    Exercise 77.3: Balance nonnegative
    Change methods payEconomical and payGourmet so that if there is not enought money, the balance does not change.

    The following main program can be used to test the program:
     */

    private double balance;

    public ex77LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has "  + this.balance + " euros";
    }
    //Method payEconomical should decrease the balance by 2.50 euros and method payGourmet by 4.00 euros.
    public void payEconomical() {
        // write code here
        //balance = balance - 2.50;
        if(balance>1){
            balance = balance -2.50;
        }
    }
    //Change methods payEconomical and payGourmet so that if there is not enough money, the balance does not change.
    public void payGourmet() {
        // write code here
        //balance = balance - 4.00;
        if(balance>1){
            balance = balance -4.00;
        }else{
            //System.out.println("if there is not enough money the balance should stay the same");
            //de ce functioneaza cu balanceAtStart = 5, dar nu functioneaza pentru alte cifre?
        }
    }
    public static void main(String[] args) {
        ex77LyyraCard card = new ex77LyyraCard(5);
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);
    }
}







