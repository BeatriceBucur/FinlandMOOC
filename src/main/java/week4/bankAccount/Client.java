package week4.bankAccount;

public class Client {
    //fields
    private String name;
    private int accountNumber;
    private int yearsLoyalty;

    //constructor
    public Client(String name, int yearsLoyalty){
        this.name = name;
        this.yearsLoyalty = yearsLoyalty;
    }
    //methods
    public String printClient(){
       return this.name + " este clientul nostru de "+ yearsLoyalty + " ani ";
    }

    @Override
    public String toString() {
        return this.name;
    }
}
