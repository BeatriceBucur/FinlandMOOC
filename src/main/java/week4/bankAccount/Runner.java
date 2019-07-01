package week4.bankAccount;

public class Runner {
    public static void main(String[] args) {
        Account account = new Account(20, "RON");
        Client client = new Client("mimi", 5);
        Client client2 = new Client("gigi", 3);
        Bank bancaMea = new Bank();

        bancaMea.addClient(client);
        bancaMea.addClient(client2);

        bancaMea.printClient();
        bancaMea.numarClient();

        /*
        client.printClient();
        account.printAccountBalance();
        System.out.println("adaugam 20 RON");
        account.addMoneyInAccount(20,"ron");
        account.printAccountBalance();
        System.out.println("scadem 30 RON");
        account.withdrawal(30, "RON");
        account.printAccountBalance();
        System.out.println("adaugam un client");
        */










    }
}
