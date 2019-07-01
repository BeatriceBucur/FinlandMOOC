package week4.bankAccount;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    //fields
    private List<Client> listaClienti = new ArrayList<>();

    //constructor

    //methods
    public void addClient(Client client){
        listaClienti.add(client);
    }

    public void printClient(){
        System.out.println("printam lista noastra de clienti " + listaClienti);
    }

    public void numarClient(){
        System.out.println(listaClienti.size());
    }
}
