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
        if(balance>=2.50){
            balance = balance -2.50;
        }
    }
    //Change methods payEconomical and payGourmet so that if there is not enough money, the balance does not change.
    public void payGourmet() {
        if(balance>=4.00){
            balance = balance -4.00;
        }
    }

    /*Exercise 77.4: Loading money to card - Add the LyyraCard the following method:
     The method should increase the balance of the card by the given amount.
     However, the maximum balance on a card is 150 euros.
     In case the balance after loading money would be more than that, it should be truncated to 150 euros.
     */

    public void  loadMoney(double amount) {
        int maxBalance = 150;
        balance+=amount;
        if( balance>maxBalance){
            balance = balance - (balance-maxBalance);
        }
    }


    public static void main(String[] args) {
        ex77LyyraCard card = new ex77LyyraCard(6);
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);

        card.loadMoney(12);
        System.out.println(card);

        card.loadMoney(150);
        System.out.println(card);
    }
}







