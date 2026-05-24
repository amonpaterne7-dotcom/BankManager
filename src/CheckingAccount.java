public class CheckingAccount extends BankAccount {
    private double limite;

    // Constructeur du compte courant
    public CheckingAccount(String compte, double solde, double limite) {
        super(compte, solde);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}