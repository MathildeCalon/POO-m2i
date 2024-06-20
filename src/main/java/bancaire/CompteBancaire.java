package bancaire;

import java.util.ArrayList;
import java.util.List;

public abstract class CompteBancaire {
    protected double solde;
    protected Client client;
    protected List<Operation> operations = new ArrayList<>();

    public CompteBancaire(double solde, Client client) {
        this.solde = solde;
        this.client = client;
        this.client.setAccounts(this);
    }

    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde += solde;
        if(solde > 0) {
            this.operations.add(new Operation(solde, Status.DEPOSIT));
        } else {
            this.operations.add(new Operation(solde, Status.WITHDRAWAL));
        }
    }

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    public void getOperations() {
        for(Operation operation : operations){
            System.out.println(operation);
        };
    }
    public void setOperations(Operation operations) {
        this.operations.add(operations);
    }

    @Override
    public String toString() {
        return "Client : " + this.client.getFirstname() + " " + this.client.getLastname() +
                "\n Solde : " + this.solde + "€" +
                "\n Type de compte : " + this.getClass().getSimpleName() ;
    }
}
