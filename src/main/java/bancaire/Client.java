package bancaire;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String firstname;
    private String lastname;
    private int telephone;
    private int id;
    private List<CompteBancaire> accounts = new ArrayList<>();

    public Client(String firstname, String lastname, int telephone, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.telephone = telephone;
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getTelephone() {
        return telephone;
    }
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setAccounts(CompteBancaire accounts) {
        this.accounts.add(accounts);
    }

    public void getAccounts() {
        for(CompteBancaire account : accounts){
            System.out.println(account);
        };
    }
}

