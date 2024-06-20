package bancaire;

public class Operation {
    private int number;
    private double amount;
    private Status status;

    public Operation(double amount, Status status) {
        this.number ++;
        this.amount = amount;
        this.status = status;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Opérations : " + this.client.getFirstname() + " " + this.client.getLastname() +
                "\n Solde : " + this.solde +
                "\n Type de compte : " + this.getClass() ;
    }
}
