package week4.bankAccount;

public class Account {

    //fields
    private int moneyAvailable;
    private String currency;

    //constructor
    public Account(int moneyAvailable, String currency){
        this.moneyAvailable = moneyAvailable;
        this.currency = currency;
    }

    //methods
    public void printAccountBalance(){
        System.out.println("are " + moneyAvailable + " " + currency+ " disponibil in cont");
    }

    public int  addMoneyInAccount(int amount, String currency){
            moneyAvailable+=amount;
            return moneyAvailable;
    }

    public int withdrawal(int amountWithdrawn, String currency){
        moneyAvailable -=amountWithdrawn;
        return amountWithdrawn;
    }






}
